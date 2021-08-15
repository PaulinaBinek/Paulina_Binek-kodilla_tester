package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

        @Test
        public void testFindFlightsFrom() {
            FlightFinder flightFinder = new FlightFinder();
            List<Flight> foundFlights = flightFinder.findFlightsFrom("katowice");
            assertEquals(2,foundFlights.size());
        }

        @Test
        public void testFindFlightsTo(){
            FlightFinder flightFinder = new FlightFinder();
            List<Flight> foundFlights = flightFinder.findFlightsTo("tokio");
            assertEquals(2,foundFlights.size());

        }


    }