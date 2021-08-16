package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        LocalDate myDate = LocalDate.of(2021, 11, 20);
        LocalDate myDate1 = LocalDate.of(2021, 9, 12);
        LocalDate myDate2 = LocalDate.of(2021, 12, 16);
        LocalDate currentDate = LocalDate.now();
        tasks.add(new Task("get food", currentDate, myDate));
        tasks.add(new Task("get cat", currentDate, myDate1));
        tasks.add(new Task("get dog", currentDate, myDate2));

        return tasks;
}
}