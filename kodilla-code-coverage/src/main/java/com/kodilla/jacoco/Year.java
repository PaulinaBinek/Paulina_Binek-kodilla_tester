package com.kodilla.jacoco;

public class Year {
    int isLeapYear;

    public Year(int year) {
        this.isLeapYear = year;
    }

    public boolean isLeap() {
        return this.isLeapYear % 4 == 0 && this.isLeapYear % 100 != 0 || this.isLeapYear % 400 == 0;
    }
}