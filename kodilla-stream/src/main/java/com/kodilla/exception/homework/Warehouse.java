package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orderList;

    public Warehouse() {
        this.orderList = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orderList.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orderList.stream().filter(order -> order.getNumber().equals(number))
                .findFirst()
                .orElseThrow(()->new OrderDoesntExistException());
    }
}