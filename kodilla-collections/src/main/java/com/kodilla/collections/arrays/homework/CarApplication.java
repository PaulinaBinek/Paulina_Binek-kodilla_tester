package com.kodilla.collections.arrays.homework;

import java.util.Random;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarApplication {
    public static Car drawCar(){

            Random random = new Random();
            int drawnCarBrand = random.nextInt(3);
            int accelerate = random.nextInt(50);
            if (drawnCarBrand == 0)
                return new Mercedes(accelerate, 0);
            else if (drawnCarBrand == 1)
                return new Opel(accelerate, 0);
            else
                return new Ford(accelerate, 0);
        }

        public static void main(String[] args) {
            Car[] cars = new Car[16];
            for (int n = 0; n < cars.length; n++)
                cars[n] = drawCar();
            for (Car car : cars)
                CarUtils.describeCar(car);
        }
    }




