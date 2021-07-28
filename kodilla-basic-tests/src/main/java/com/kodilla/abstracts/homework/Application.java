package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(2);

        System.out.println("Square A is : " + square.A);
        System.out.println("Square surface area is: " + square.calcSurface());
        System.out.println("Square perimeter is: " + square.calcPerimeter());

        Rectangle rectangle = new Rectangle(1,2);

        System.out.println("Rectangle A is : " + rectangle.A);
        System.out.println("Rectangle B is : " + rectangle.B);
        System.out.println("Rectangle surface area is: " + rectangle.calcSurface());
        System.out.println("Rectangle perimeter is: " + rectangle.calcPerimeter());

        Circle circle = new Circle(3);

        System.out.println("Circle R is : " + circle.R);
        System.out.println("Circle surface area is: " + circle.calcSurface());
        System.out.println("Circle perimeter is: " + circle.calcPerimeter());

    }
}