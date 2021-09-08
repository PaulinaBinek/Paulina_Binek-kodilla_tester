package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private NotificationService notificationService;

    private DeliveryService deliveryService = new DeliveryService();

    public ShippingCenter(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}