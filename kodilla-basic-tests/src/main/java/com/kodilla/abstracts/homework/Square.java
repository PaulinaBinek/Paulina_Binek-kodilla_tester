package com.kodilla.abstracts.homework;

public class Square extends Shape {


    public Square(int parameterA, int parameterB, int parameterR) {
        super(parameterA, parameterB, parameterR);
    }

    @Override
    public double calcSurface() {
        return getParameterA()* getParameterA();
    }

    @Override
    public double calcPerimeter() {
        return 4 * getParameterA();
    }
}
