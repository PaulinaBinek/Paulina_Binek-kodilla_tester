package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {
        {
            Given("I have deposited $200 in my wallet", () -> {
                wallet.deposit(200);
                Assert.assertEquals("Incorrect wallet balance", 200, wallet.getBalance());
            });
            When("I request $50", () -> {
                Cashier cashier = new Cashier(cashSlot);
                cashier.withdraw(wallet, 50);
            });
            Then("$50 should be dispensed", () -> Assert.assertEquals(50, cashSlot.getContents()));
            Then("The balance should be $150",
                    () -> Assert.assertEquals("Incorrect wallet balance", 150, wallet.getBalance()));


            Given("I have deposited $1000 in my wallet", () -> {
                wallet.deposit(1000);
                Assert.assertEquals("Incorrect wallet balance", 1000, wallet.getBalance());
            });
            When("I request $1000", () -> {
                Cashier cashier = new Cashier(cashSlot);
                cashier.withdraw(wallet, 1000);
            });
            Then("$1000 should be dispensed", () -> Assert.assertEquals(1000, cashSlot.getContents()));
            Then("The balance should be $0", () ->
                    Assert.assertEquals("Incorrect wallet balance", 0, wallet.getBalance()));


            Given("There is $100 in my wallet", () -> {
                wallet.deposit(100);
                Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
            });
            When("I want to withdraw $200", () -> {
                Cashier cashier = new Cashier(cashSlot);
                cashier.withdraw(wallet, 200);
            });
            Then("It can't be dispensed", () -> {
                Assert.assertEquals(100, wallet.getBalance());
            });
            Then("I should be told that I don't have enough money in my wallet", () -> {
                Assert.assertEquals("You don't have enough money in your wallet", "You don't have enough money in your wallet");
            });


            Given("I have deposited $100 in my wallet", () -> {
                wallet.deposit(100);
                Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance());
            });
            When("I don't want any withdrawal", () -> {
                Cashier cashier = new Cashier(cashSlot);
                cashier.withdraw(wallet, 0);
            });
            Then("$0 should be dispensed", () -> Assert.assertEquals(0, cashSlot.getContents()));
            Then("The balance should be $100",
                    () -> Assert.assertEquals("Incorrect wallet balance", 100, wallet.getBalance()));

        }
    }}