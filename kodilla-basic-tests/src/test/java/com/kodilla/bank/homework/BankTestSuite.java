package com.kodilla.bank.homework;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldSumAllTransactions() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(10);
        cashMachine2.add(20);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank test1 = new Bank((cashMachines));
        assertEquals(30, test1.sumAllTransactions());
    }

    @Test
    public void shouldCalculateNumberOfMinusBalanceTransactions() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(-10);
        cashMachine1.add(-10);
        cashMachine1.add(10);
        cashMachine2.add(20);
        cashMachine2.add(20);
        cashMachine2.add(-20);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank test2 = new Bank(cashMachines);
        assertEquals(3, test2.getNumberOfMinusBalanceTransactions());
    }

    @Test
    public void shouldCalculateNumberOfPlusBalanceTransactions() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(-10);
        cashMachine1.add(-10);
        cashMachine1.add(10);
        cashMachine1.add(10);
        cashMachine2.add(20);
        cashMachine2.add(20);
        cashMachine2.add(20);
        cashMachine2.add(-20);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank test3 = new Bank(cashMachines);
        assertEquals(5, test3.getNumberOfPlusBalanceTransactions());
    }

    @Test
    public void shouldCalculateAverageMinusBalanceValue() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(100);
        cashMachine1.add(100);
        cashMachine1.add(-100);
        cashMachine1.add(50);
        cashMachine2.add(-100);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank test4 = new Bank(cashMachines);
        assertEquals(-100, test4.getAverageMinusBalanceAtms(), 0.001);


    }

    @Test
    public void shouldCalculateAveragePlusBalanceValue() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(100);
        cashMachine1.add(100);
        cashMachine2.add(100);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank test5 = new Bank(cashMachines);
        assertEquals(100, test5.getAveragePlusBalanceAtms(), 0.001);


    }

}