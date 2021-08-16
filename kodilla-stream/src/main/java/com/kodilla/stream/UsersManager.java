package com.kodilla.stream;

public class UsersManager {
    public static void main(String[] args) {
        UsersRepository.getUsersList()
                .stream()
                .filter(u -> u.getGroup().equals("Chemists")) // [1]
                .map(UsersManager::getUserName)
                .forEach(un -> System.out.println(un));
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}