package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private Airport airport;
    private String departure;
    private String arrival;

    public Flight(Airport airport, String departure, String arrival) {
        this.airport = airport;
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public Airport getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return departure.equals(flight.departure) && arrival.equals(flight.arrival) && airport == flight.airport;
    }

    @Override
    public int hashCode() {
        return Objects.hash(departure, arrival, airport);
    }
}
