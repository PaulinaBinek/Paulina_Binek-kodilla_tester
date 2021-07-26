package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle(int parameterA, int parameterB, int parameterR) {
        super(parameterA, parameterB, parameterR);
    }

    @Override
    public double calcSurface() {
        return getParameterA() * getParameterB();
    }

    @Override
    public double calcPerimeter() {
        return 2 * getParameterA() + 2 * getParameterB();
    }
}
