package com.kodilla.exception.homework;

import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse.addOrder("123");
        Warehouse.addOrder("456");
        Warehouse.addOrder("789");
        Warehouse.addOrder("101");
        System.out.println(Warehouse.getOrdersList().size());

        try {
            Order isOrderOnTheList = Warehouse.getOrder("2232323");
        } catch (OrderDoesntExistException e) {
            System.out.println("We don't have such order");
        }
    }
}