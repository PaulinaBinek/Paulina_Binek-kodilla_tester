package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    private List<Order> orders = new ArrayList<>();


    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public static List<LocalDate> getOrderByDate(
            LocalDate startDate, LocalDate endDate) {

        return startDate.datesUntil(endDate)
                .collect(Collectors.toList());
    }

    public List<Order> filterOrders(int minPrice, int maxPrice){
        List<Order> results = new ArrayList();
        orders.stream().filter(p -> p.getValueOfOrder() > minPrice && p.getValueOfOrder() < maxPrice).forEach(results::add);
        return results;
    }

    public void getOrderSize() {
        this.orders.size();
    }

    public int sumOfOrders() {
        List<Order> valueOfOrders = new ArrayList<>();
        Integer sum = valueOfOrders.stream()
                .collect(Collectors.summingInt(Order::getValueOfOrder));
        return sum;
    }
}
