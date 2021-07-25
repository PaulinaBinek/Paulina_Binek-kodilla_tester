package com.kodilla.inheritance.homework;

public class SystemApplication {

        public static void main(String[] args) {
            NewSystem newSystem = new NewSystem(2020);
            newSystem.turnOff();
            System.out.println(newSystem.getYear());

            OldSystem oldSystem = new OldSystem(2006);
            oldSystem.turnOn();
            System.out.println(oldSystem.getYear());

            OperatingSystem operatingSystem = new OperatingSystem(2012);
            operatingSystem.turnOff();
            System.out.println(operatingSystem.getYear());
        }
    }

