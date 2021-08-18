package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import com.kodilla.stream.UsersRepository;


public class ForumStats {
    public static void main(String[] args) {
       double avg = UsersRepository.getUsersList()
                .stream()
                .filter( n -> n.getAge() >= 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt( n-> n)
                .average()
                .getAsDouble();
        System.out.println(avg);

        double avg2 = UsersRepository.getUsersList()
                .stream()
                .filter( n -> n.getAge() < 40)
                .map(u -> u.getNumberOfPost())
                .mapToInt( n-> n)
                .average()
                .getAsDouble();
        System.out.println(avg2);
    }
}
