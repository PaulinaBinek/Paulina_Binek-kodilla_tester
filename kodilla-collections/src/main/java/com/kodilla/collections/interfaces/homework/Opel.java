package com.kodilla.collections.interfaces.homework;

public class Opel implements Car{

    private int acceleration;
    private int deceleration;

    public Opel(int acceleration, int deceleration) {
        this.acceleration = acceleration;
        this.deceleration = deceleration;

    }
    @Override
    public int getSpeed() {
       return 2 * acceleration + 2 * deceleration  ;
    }

    @Override
    public void increaseSpeed() {
    }

    @Override
    public void decreaseSpeed() {

    }
}
