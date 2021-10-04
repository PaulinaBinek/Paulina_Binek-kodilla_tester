import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleResults;
import pages.GoogleSearch;
import pages.RandomSearch;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class TestGoogle {

    WebDriver driver;


    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\binek\\IdeaProjects\\kodilla-course\\kodilla-google-selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");

    }
    @After
   public void tearDown() {     driver.close();}

    @Test
    public void testGooglePage() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
    }

    @Test
    public void shouldShowRandomSearchResult() {
        GoogleSearch googleSearch = new GoogleSearch(driver);
        googleSearch.searchResults();
        GoogleResults googleResults = new GoogleResults(driver);
        WebElement webElement = googleResults.randomResult();
        RandomSearch randomResult = new RandomSearch(driver);
        WebElement randomWebElement = randomResult.randomPage(webElement);
        assertEquals(webElement, randomWebElement);
} }

