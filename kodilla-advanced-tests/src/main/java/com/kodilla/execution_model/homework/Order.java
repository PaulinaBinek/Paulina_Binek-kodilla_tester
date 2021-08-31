package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private int valueOfOrder;
    private LocalDate dateOfOrder;
    private String loginName;

    public Order(int valueOfOrder, LocalDate dateOfOrder, String loginName) {
        this.valueOfOrder = valueOfOrder;
        this.dateOfOrder = dateOfOrder;
        this.loginName = loginName;
    }


    public int getValueOfOrder() {
        return valueOfOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public String getLoginName() {
        return loginName;
    }

    @Override
    public String toString() {
        return "Order{" +
                "valueOfOrder=" + valueOfOrder +
                ", dateOfOrder=" + dateOfOrder +
                ", loginName='" + loginName + '\'' +
                '}';
    }
}