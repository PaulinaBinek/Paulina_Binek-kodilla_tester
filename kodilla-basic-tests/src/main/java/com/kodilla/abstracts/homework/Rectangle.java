package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    public double A;
    public double B;

    public Rectangle(double A, double B) {
        this.A = A;
        this.B = B;
    }

    @Override
    public double calcSurface() {
        return A * B;
    }

    @Override
    public double calcPerimeter() {
        return 2 * A + 2 * B;
    }
}