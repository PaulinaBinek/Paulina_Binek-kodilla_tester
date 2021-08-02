package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(30, -20);
        doRace(ford);
        Opel opel = new Opel(30, -10);
        doRace(opel);
        Mercedes mercedes = new Mercedes(50, -15);
        doRace(mercedes);
    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("Speed is " + car.getSpeed() + " km/h");
    }
}
