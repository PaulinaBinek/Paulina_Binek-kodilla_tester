package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Random;



@Configuration
public class CarChoice {

    private Car car;
    private Seasons seasons;

    @Bean
    public Car chooseCar() {
        {
            Random random = new Random();
            int number = random.nextInt(4 + 1);
            switch (number) {
                case 1:
                    seasons = Seasons.SUMMER;
                    car = new Cabrio();
                    break;
                case 2:
                    seasons = Seasons.SPRING;
                    car = new Sedan();
                    break;
                case 3:
                    seasons = Seasons.WINTER;
                    car = new SUV();
                    break;
                case 4:
                    seasons = Seasons.AUTUMN;
                    car = new Sedan();
                    break;
            }
            return car;
        }
    }}
