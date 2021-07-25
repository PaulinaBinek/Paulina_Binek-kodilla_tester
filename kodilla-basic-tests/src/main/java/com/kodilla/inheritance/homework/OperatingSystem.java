package com.kodilla.inheritance.homework;

public class OperatingSystem {
private int year;

public OperatingSystem(int year) {
    this.year = year;
}

    public void turnOn() {
        System.out.println("on");
    }
    public void turnOff() {
        System.out.println("off");
    }

    public int getYear() {
        return year;
    }

}
