package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;

import java.util.List;


public class Shop {

    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> orderDate(LocalDate startDate, LocalDate endDate) {
        List<Order> orderDate = new ArrayList<>();
        orders.stream().filter(x -> x.getDateOfOrder().isBefore(endDate) && x.getDateOfOrder().isAfter(startDate)).forEach(orderDate::add);
        return orderDate;
    }

    public List<Order> filterOrders(int minPrice, int maxPrice){
        List<Order> results = new ArrayList();
        orders.stream().filter(p -> p.getValueOfOrder() >= minPrice && p.getValueOfOrder() <= maxPrice).forEach(results::add);
        return results;
    }

    public int getOrderSize() {
       return this.orders.size();
    }

    public int  sumOfOrders() {
        int sum = orders.stream()
                .mapToInt(i -> i.getValueOfOrder())
                .sum();
        return sum;
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addOrder(new Order(23, LocalDate.of(2021,2,20), "John1"));
        shop.addOrder(new Order(12, LocalDate.of(2021,3,24), "John2"));
        shop.addOrder(new Order(43, LocalDate.of(2021,4,3), "John3"));
        shop.addOrder(new Order(144, LocalDate.of(2021,5,10), "John4"));
        System.out.println(shop.getOrderSize());
        System.out.println(shop.filterOrders(12,50));
        System.out.println(shop.sumOfOrders());
        System.out.println(shop.orderDate(LocalDate.of(2021,2,1), LocalDate.of(2021,4,20)));
    }

}
