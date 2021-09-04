package com.kodilla.mockito.homework;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ServiceTestSuite {
    Service service = new Service();
    Alert alert = Mockito.mock(Alert.class);
    User user  = Mockito.mock(User.class);
    Location location = Mockito.mock(Location.class);

    @Test
    public void onlySubscribedPersonsShouldReceiveWeatherAlert() {
        service.sendAlertToAllSubscribers(alert);
        Mockito.verify(user, Mockito.never()).receiveAlert(alert);
    }

    @Test
    public void eachSubscriberShouldReceiveTheirLocationAlert() {
        service.addSubscriber(user, location);
        service.sendAlertToTheSpecificLocation(alert, location);
        Mockito.verify(user, Mockito.times(1)).receiveAlert(alert);
    }


    @Test
    public void eachSubscriberShouldNotReceiveDoubledAlertToTheSameLocation() {
        service.addSubscriber(user, location);
        service.addSubscriber(user, location);
        service.sendAlertToTheSpecificLocation(alert, location);
        Mockito.verify(user, Mockito.times(1)).receiveAlert(alert);
    }

    @Test
    public void eachSubscriberShouldReceiveAlertsForAllSubscribedLocations() {
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        service.addSubscriber(user, location1);
        service.addSubscriber(user, location2);
        service.sendAlertToTheSpecificLocation(alert, location1);
        service.sendAlertToTheSpecificLocation(alert, location2);
        Mockito.verify(user , Mockito.times(2)).receiveAlert(alert);
    }


    @Test
    public void checkIfOneLocationIsRemoved() {
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        service.addLocation(location1);
        service.addLocation(location2);
        service.addSubscriber(user, location1);
        service.addSubscriber(user, location2);
        service.removeOneLocation(location1);
        service.sendAlertToTheSpecificLocation(alert, location1);
        service.sendAlertToTheSpecificLocation(alert, location2);
        Mockito.verify(user, Mockito.times(1)).receiveAlert(alert);
    }


    @Test
    public void checkIfSubscriberIsRemoved(){
       service.addSubscriber(user,location);
       service.removeSubscriber(location, user);
       service.sendAlertToTheSpecificLocation(alert, location);
       Mockito.verify(user, Mockito.never()).receiveAlert(alert);
    }

}