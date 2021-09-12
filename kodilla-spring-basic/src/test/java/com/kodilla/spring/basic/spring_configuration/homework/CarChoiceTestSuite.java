package com.kodilla.spring.basic.spring_configuration.homework;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootTest
class CarChoiceTestSuite {

    @Test
    public void shouldChooseCarByTheSeason() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        String carType = car.getCarType();
        List<String> carTypes = Arrays.asList("Sedan", "SUV", "Cabrio");
        Assertions.assertTrue(carTypes.contains(carType));
    }

    @Test
    public void lightsAreOn() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Car car = (Car) context.getBean("chooseCar");
        boolean lights = car.hasHeadlightsTurnedOn(LocalTime.of(22,0));
        Assertions.assertTrue(lights);
    }

   @Test
    public void lightAreOff() {
       ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
       Car car = (Car) context.getBean("chooseCar");
       boolean noLights = car.hasHeadlightsTurnedOn(LocalTime.of(14,0));
       Assertions.assertFalse(noLights);
   }
}