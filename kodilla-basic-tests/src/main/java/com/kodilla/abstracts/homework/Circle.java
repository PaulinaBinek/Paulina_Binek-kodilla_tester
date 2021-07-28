package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public double R;
    static final double PI = 3.1415927;


    public Circle(double R) {
        this.R = R;
    }

    @Override
    public double calcSurface() {
        return PI * R * R;
    }

    @Override
    public double calcPerimeter() {
        return 2 * PI * R;
    }
}