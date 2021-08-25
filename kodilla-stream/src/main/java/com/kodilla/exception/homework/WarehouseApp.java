package com.kodilla.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("123"));
        warehouse.addOrder(new Order("23242"));
        warehouse.addOrder(new Order("312413"));

        try {
            System.out.println(warehouse.getOrder("123"));
        } catch(OrderDoesntExistException e){
            System.out.println("We don't have such order");
        }
    }
}