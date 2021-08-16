package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        List<LocalDate> ongoing = TaskRepository.getTask()
                .stream()
                .filter(u -> u.getDeadline().isAfter(currentDate))
                .map(TaskManager::getDates)
                .collect(Collectors.toList()); // [2]
        System.out.println(ongoing);
    }
    public static LocalDate getDates(Task task) {
        return task.getDeadline();
    }

}