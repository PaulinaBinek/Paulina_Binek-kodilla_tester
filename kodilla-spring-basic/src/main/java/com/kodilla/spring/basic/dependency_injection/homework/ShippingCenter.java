package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter implements NotificationService {

    private DeliveryService deliveryService = new DeliveryService();

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            success(address);
        } else {
            fail(address);
        }


    }

    @Override
    public void success(String address) {
        System.out.println("Package delivered to: " + address);
    }

    @Override
    public void fail(String address) {
        System.out.println("Package not delivered to: " + address);
    }
}