package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {


        public static void describeCar(Car car) {
            System.out.println("-----------------------------");
            System.out.println("Car brand: " + getCarBrand(car));
            System.out.println("Car acceleration: " + car.getIncreaseSpeed());

        }

        private static String getCarBrand(Car car) {
            if (car instanceof Ford)
                return "Ford";
            else if (car instanceof Mercedes)
                return "Fiat";
            else if (car instanceof Opel)
                return "Opel";
            else
                return "Unknown car brand";
        }
    }


