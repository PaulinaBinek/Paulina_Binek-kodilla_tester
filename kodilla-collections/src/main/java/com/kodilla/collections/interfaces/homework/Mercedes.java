package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Mercedes implements Car{
    private int acceleration;
    private int deceleration;
    private int speed;

    public Mercedes(int acceleration, int deceleration) {
        this.acceleration = acceleration;
        this.deceleration = deceleration;
        this.speed = speed;

    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {

        speed = speed + acceleration;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - deceleration;

    }

    @Override
    public int getIncreaseSpeed() {
        return acceleration;
    }


}
