package com.kodilla.bank.homework;

public class Bank {
    CashMachine cashMachine[];


    public Bank(CashMachine cashMachines[]) {
        this.cashMachine = cashMachines;


    }

    public int sumAllTransactions() {
        int sumAllTransactions = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            sumAllTransactions = sumAllTransactions + cashMachine[i].getBalanceOfCashMachine();
        }
        return sumAllTransactions;
    }


    public int getNumberOfMinusBalanceTransactions() {
        int minusBalanceTransactions = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            minusBalanceTransactions += cashMachine[i].getMinusBalance();
        }
        return minusBalanceTransactions;
    }



    public int getNumberOfPlusBalanceTransactions() {
        int plusBalanceTransactions = 0;
        for (int i = 0; i < cashMachine.length; i++) {
            plusBalanceTransactions += cashMachine[i].getPlusBalance();
        }
        return plusBalanceTransactions;
    }



    public double getAverageMinusBalanceAtms() {
        for (int i = 0; i < cashMachine.length; i++) {
            if (cashMachine[i].getBalanceOfCashMachine() == 0) {
                return 0;
            }
        }
        double averageMinusBalanceAtms = 0;

        for (int i = 0; i < cashMachine.length; i++) {
            averageMinusBalanceAtms += cashMachine[i].averageMinusBalance() / cashMachine.length;
        } return averageMinusBalanceAtms;

    }

    public double getAveragePlusBalanceAtms() {
        for (int i = 0; i < cashMachine.length; i++) {
            if (cashMachine[i].getBalanceOfCashMachine() == 0) {
                return 0;
            }}
        double averagePlusBalanceAtms = 0;

        for (int i = 0; i < cashMachine.length; i++) {
            averagePlusBalanceAtms += cashMachine[i].averagePlusBalance() / cashMachine.length;
        } return averagePlusBalanceAtms; }


    public static void main(String[] args) {

        CashMachine euronet = new CashMachine();

        euronet.add(20);
        euronet.add(300);
        euronet.add(-80);
        euronet.add(-80);
        euronet.add(100);

        System.out.println("Euronet ATM Balance is: " + euronet.getBalanceOfCashMachine());
        System.out.println("Euronet ATM number of transactions is: " + euronet.getNumberOfTransactions());
        System.out.println("Euronet ATM number of plus balance transactions is: " + euronet.getPlusBalance());
        System.out.println("Euronet ATM number of minus balance transactions is: " + euronet.getMinusBalance());
        System.out.println("Euronet ATM average plus balance transactions value is: " + euronet.averagePlusBalance());
        System.out.println("Euronet ATM average minus balance transactions value is: " + euronet.averageMinusBalance());

        CashMachine planetCash = new CashMachine();

        planetCash.add(500);
        planetCash.add(-200);
        planetCash.add(-50);
        planetCash.add(-300);
        planetCash.add(50);

        System.out.println("Planet Cash ATM Balance is: " + planetCash.getBalanceOfCashMachine());
        System.out.println("Planet Cash number of transactions is: " + planetCash.getNumberOfTransactions());
        System.out.println("Planet Cash number of plus balance transactions is: " + planetCash.getPlusBalance());
        System.out.println("Planet Cash number of minus balance transactions is: " + planetCash.getMinusBalance());
        System.out.println("Planet Cash average plus balance transactions value is: " + planetCash.averagePlusBalance());
        System.out.println("Planet Cash average minus balance transactions value is: " + planetCash.averageMinusBalance());

        CashMachine[] cashMachines = new CashMachine[] {euronet, planetCash};
        System.out.println("Number of ATMs is " + cashMachines.length);

        Bank bank = new Bank(cashMachines);
        System.out.println("Sum of all transactions on all ATMs is " + bank.sumAllTransactions());
    }
}