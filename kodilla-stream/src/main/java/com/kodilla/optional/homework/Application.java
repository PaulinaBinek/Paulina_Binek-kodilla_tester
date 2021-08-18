package com.kodilla.optional.homework;

import com.kodilla.stream.homework.TaskManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Teacher teacherNull = null;
        Teacher teacher1 = new Teacher("David");
        Teacher teacher2 = new Teacher("Michael");
        Student student1 = new Student("Jim", teacher1);
        Student student2 = new Student("Pam", teacher2);
        Student student3 = new Student("Dwight", null);
        Student student4 = new Student("Angela", null);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);



        for (Student student: students) {
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            Teacher isNull = optionalTeacher.orElse(new Teacher("unidentified"));
            System.out.println("Student: " + student.getName() + " Teacher: " + isNull.getName());
        }
    }
}



