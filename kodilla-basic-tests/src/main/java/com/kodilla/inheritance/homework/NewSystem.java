package com.kodilla.inheritance.homework;

public class NewSystem extends OperatingSystem {

    public NewSystem (int year) {
        super(year);
        System.out.println("New System ");
    }

    @Override
    public void turnOn() {
        System.out.print("Starts a new system ");
    }

    @Override
    public void turnOff() {
        System.out.print("Ends a new system ");
    }
}
