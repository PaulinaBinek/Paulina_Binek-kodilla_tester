package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private List<Integer> numberOfStudents = new ArrayList<>();

    public School(String schoolName, int... numberOfStudents) {
        this.schoolName = schoolName;
        for (int school : numberOfStudents)
            this.numberOfStudents.add(school);

    }

    public int sumOfStudents() {
        int sum = 0;
        for (int students : numberOfStudents)
            sum = sum + students;
        return sum;
    }



    public String getSchoolName() {
        return schoolName;
    }

}