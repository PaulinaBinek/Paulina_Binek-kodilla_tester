package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RandomSearch  extends AbstractPage{

    @FindBy(css = "div[class='g']")
    static WebElement webElement;

    public RandomSearch(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public WebElement randomPage(WebElement googleResults) {
        webElement = googleResults;
        webElement.click();
        return webElement;
    }
}
