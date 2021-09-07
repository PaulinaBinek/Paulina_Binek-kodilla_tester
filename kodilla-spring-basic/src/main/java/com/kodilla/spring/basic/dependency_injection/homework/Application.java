package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        ShippingCenter shippingCenter = new ShippingCenter();
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
        shippingCenter.sendPackage("Ellesmere Port, UK", 32);
    }
}