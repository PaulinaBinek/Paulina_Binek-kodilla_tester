package com.kodilla.collections.sets.homework;



import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("The Witcher", 20, 15, false));
        stamps.add(new Stamp("Lion King", 20, 15, false));
        stamps.add(new Stamp("Cracow", 10, 10, true));
        stamps.add(new Stamp("The Witcher", 20, 15, false));

        System.out.println(stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);
    }


}

