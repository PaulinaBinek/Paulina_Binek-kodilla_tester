package com.kodilla.mockito.homework;

import com.kodilla.notification.Notification;

import java.time.chrono.ThaiBuddhistEra;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Service {

    private HashMap<Location, Set<User>> application = new HashMap<>();

    public void addSubscriber(User user, Location location) {
        if (application.containsKey(location)) {
            this.application.get(location).add(user);
        } else {
            Set<User> users = new HashSet<>();
            users.add(user);
            this.application.put(location, users);
        }
    }


    public void addLocation(Location location) {
            this.application.put(location,  new HashSet<>());
    }


    public void removeOneLocation(Location location) {
            this.application.remove(location);

    }

    public void removeSubscriber(Location location, User user) {
        if (this.application.containsKey(location)) {
            this.application.get(location).remove(user);
        }
    }


    public void sendAlertToAllSubscribers(Alert alert) {
        this.application.values().forEach(x -> x.forEach(user -> user.receiveAlert(alert)));
    }

    public void sendAlertToTheSpecificLocation(Alert alert, Location location) {
        if (this.application.containsKey(location)) {
            application.get(location).forEach(x -> x.receiveAlert(alert));
        }
    }
    }

