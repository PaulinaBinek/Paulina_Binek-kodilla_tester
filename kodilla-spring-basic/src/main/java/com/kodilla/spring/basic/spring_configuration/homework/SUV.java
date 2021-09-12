package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalTime;

public class SUV implements Car{
    @Override
    public boolean hasHeadlightsTurnedOn(LocalTime clock) {
        return clock.isAfter(LocalTime.of(20, 0)) || clock.isBefore(LocalTime.of(6, 0));
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
