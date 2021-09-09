package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        NotificationService notificationService = new DeliveryService();
        DeliveryService deliveryService = new DeliveryService();
        ShippingCenter shippingCenter = new ShippingCenter(notificationService, deliveryService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        shippingCenter.sendPackage("Ellesmere Port, UK", 32);
    }
}