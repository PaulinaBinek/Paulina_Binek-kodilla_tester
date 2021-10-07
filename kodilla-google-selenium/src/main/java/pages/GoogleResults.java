package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {


    @FindBy(css = "div[class='g']")                  // [1]
    private List<WebElement> results;


    public GoogleResults(WebDriver driver) {         // [3]
        super(driver);                                // [4]
        PageFactory.initElements(this.driver, this);  // [5]
    }
    public void isSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public WebElement randomResult(){
        Random randomPage = new Random();
        int randomLink = randomPage.nextInt(results.size());
        System.out.println("Pick page " + randomLink);
        return results.get(randomLink);
    }
}
