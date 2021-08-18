package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        double avg = UsersRepository.getUsersList()   // [1]
                .stream()
                .map(u -> u.getAge())
                .mapToInt( n-> n)
                .average()
                .getAsDouble();
        System.out.println(avg);
    }
}
