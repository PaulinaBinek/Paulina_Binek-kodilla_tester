package com.kodilla.inheritance.homework;

public class OldSystem extends OperatingSystem {

    public OldSystem (int year) {
        super(year);
        System.out.println("Old System");
    }


    @Override
    public void turnOn() {
        System.out.print("Starts old system ");
    }
    @Override
    public void turnOff() {
        System.out.print("Ends old system ");
    }
}
