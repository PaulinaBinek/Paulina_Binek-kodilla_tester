package com.kodilla.collections.adv.exercises.homework;

import com.kodilla.collections.adv.exercises.dictionary.EnglishWord;
import com.kodilla.collections.adv.exercises.dictionary.PartOfSpeech;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight(Airport.KTW, "katowice", "tokio"));
        flights.add(new Flight(Airport.WAW, "warszawa", "krakow"));
        flights.add(new Flight(Airport.LDN, "londyn", "tokio"));
        flights.add(new Flight(Airport.KTW, "katowice", "gdynia") );

        return flights;
    }

    public int size() {
        return getFlightsTable().size();
    }

    public static void main(String[] args) {
        System.out.println(getFlightsTable().size());
    }
}