package com.kodilla.abstracts.homework;

public class Square extends Shape {
    public double A;

    public Square(double A) {
        this.A = A;
    }

    @Override
    public double calcSurface() {
        return A * A;
    }

    @Override
    public double calcPerimeter() {
        return 4 * A;
    }
}