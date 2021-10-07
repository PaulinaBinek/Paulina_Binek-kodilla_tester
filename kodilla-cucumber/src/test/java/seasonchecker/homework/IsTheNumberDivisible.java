package seasonchecker.homework;

import com.sun.tools.javac.code.Attribute;
import io.cucumber.java8.En;
import org.junit.Assert;
import seasonchecker.homework.NumberChecker;

import java.time.MonthDay;

public class IsTheNumberDivisible implements En {

    private String reply;
    private int number;

    public IsTheNumberDivisible() {
        Given("Number is {int}", (Integer int1) -> {
            this.number = int1;
        });

        When("I check whether it can be divided by given numbers", () -> {
            NumberChecker numberChecker = new NumberChecker();
            this.reply = numberChecker.checkIfNumberIsDivisible(this.number);
        });

        Then("It should be {string}", (String string) -> {
            Assert.assertEquals(string, this.reply);
        });



    }}

