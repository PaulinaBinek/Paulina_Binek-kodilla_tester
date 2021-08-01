package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int numberOfTransactions;
    private int sum;
    private int plusBalance;
    private int minusBalance;

    public CashMachine() {
        this.numberOfTransactions = 0;
        this.transactions = new int[0];
        this.sum = 0;

    }

    public void add(int value) {
        this.numberOfTransactions++;
        int[] newTab = new int[this.numberOfTransactions];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.numberOfTransactions - 1] = value;
        this.transactions = newTab;
        if (value > 0) {
            plusBalance++;
        } else {
            minusBalance++;
        }
    }

    public int getBalanceOfCashMachine() {
        for (int i = 0; i < numberOfTransactions; i++) {
            sum += transactions[i];
        }
        return sum;
    }

    public double averagePlusBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }

        double averagePlusBalance = 0;
        for (int i = 0; i < this.numberOfTransactions; i++)
            if (this.transactions[i] > 0) {
                averagePlusBalance = averagePlusBalance + this.transactions[i];
            }

        return averagePlusBalance / this.plusBalance;
    }

    public double averageMinusBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }

        double averageMinusBalance = 0;
        for (int i = 0; i < this.numberOfTransactions; i++)
            if (this.transactions[i] < 0) {
                averageMinusBalance = averageMinusBalance + this.transactions[i];
            }

        return averageMinusBalance / this.minusBalance;
    }


    public int getNumberOfTransactions() {
        return numberOfTransactions;
    }


    public int getPlusBalance() {
        return plusBalance;
    }

    public int getMinusBalance() {
        return minusBalance;
    }

    public int[] getTransactions() {
        return transactions;

    }
}