package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int parameterA;
    private int parameterB;
    private int parameterR;
    static final double PI = 3.1415927;

    public Shape(int parameterA, int parameterB, int parameterR) {
        this.parameterA = parameterA;
        this.parameterB= parameterB;
        this.parameterR = parameterR;
    }

    public int getParameterA() {

        return parameterA;
    }

    public int getParameterB() {
        return parameterB;
    }

    public int getParameterR() {
        return parameterR;
    }

    public abstract double calcSurface();
    public abstract double calcPerimeter();
}
