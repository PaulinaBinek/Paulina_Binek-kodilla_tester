package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;


public class Warehouse {
    private static List<Order> orders = new ArrayList<>();

    public Warehouse(List<Order> orders) {
        this.orders = orders;
    }

    public static List<Order> addOrder(String orderNumber) {
        orders.add(new Order(orderNumber));
        return orders;
    }

    public static Order getOrder(String number) throws OrderDoesntExistException{
        return getOrdersList().stream()
                .filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(()->new OrderDoesntExistException());
    }


    public static List<Order> getOrdersList() {
        return orders;
    }

    public int size() {
        return orders.size();
    }
}