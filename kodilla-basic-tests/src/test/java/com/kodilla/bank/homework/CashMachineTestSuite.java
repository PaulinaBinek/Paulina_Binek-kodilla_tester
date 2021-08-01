package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(215);
        cashMachine.add(-85);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
        assertEquals(215, transactions[0]);
        assertEquals(-85, transactions[1]);
    }

    @Test
    public void shouldGetSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(2);
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(-10);
        assertEquals(12, cashMachine.getBalanceOfCashMachine());
    }

    @Test
    public void shouldGetExpectedNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(656754);
        cashMachine.add(345634563);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);

    }

    @Test
    public void shouldGetExpectedNumberOfPlusBalanceTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(34);
        cashMachine.add(35);
        cashMachine.add(32);
        assertEquals(3, cashMachine.getPlusBalance());

    }

    @Test
    public void shouldGetExpectedNumberOfMinusBalanceTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(-65);
        cashMachine.add(34);
        cashMachine.add(35);
        cashMachine.add(32);
        assertEquals(4, cashMachine.getMinusBalance());

    }

    @Test
    public void averageShouldBeZeroIfCashMachineDontHaveValue() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.averagePlusBalance(), 0.0001);
    }

    @Test
    public void shouldCalculateCashMachineAveragePlusBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(100);
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(10);
        cashMachine.add(100);
        assertEquals(35.714, cashMachine.averagePlusBalance(), 0.001);
    }

    @Test
    public void shouldCalculateCashMachineAverageMinusBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-10);
        cashMachine.add(-10);
        cashMachine.add(-100);
        cashMachine.add(-10);
        cashMachine.add(-10);
        cashMachine.add(-10);
        cashMachine.add(-100);
        assertEquals(-35.714, cashMachine.averageMinusBalance(), 0.001);
    }

    @Test
    public void shouldCalculateAllTransactions() {
        CashMachine cashMachine1 = new CashMachine();
        CashMachine cashMachine2 = new CashMachine();
        cashMachine1.add(10);
        cashMachine2.add(20);
        CashMachine[] cashMachines = new CashMachine[]{cashMachine1, cashMachine2};
        Bank test = new Bank((cashMachines));
        assertEquals(30, test.sumAllTransactions());

    }
}