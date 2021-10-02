package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement cookies = driver.findElement(By.cssSelector("div > div > button.mgn2_14"));
        cookies.click();

        WebElement dropDown = driver.findElement(By.cssSelector("div > div > select.mr3m_1")); // "//*[@data-role=\"filters\"]/div/select" /html/body/div[2]/div[4]/header/div/div/div[1]/div/form/div[3]/div/select
        Select electricSelect = new Select(dropDown);
        electricSelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.cssSelector("div > form > input.mr3m_1")); // "//*[contains(@data-prototype-id, "metrumHeader")]/div/form/input" "/html/body/div[2]/div[4]/header/div/div/div[1]/div/form/input"
        inputField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.cssSelector(" div > form > button._13q9y")); // "//*[contains(@data-analytics-groups, \"allegro.header\")]div/form/button" /html/body/div[2]/div[3]/header/div[1]/div/div[1]/div/form/button // data-analytics-groups allegro.metrumHeader.search
        searchButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div > a.msts_9u")));

        List<WebElement> element = driver.findElements(By.cssSelector("section > article.mx7m_1"));
        System.out.println(element.get(0).getText());
        System.out.println(element.get(1).getText());
        System.out.println(element.get(2).getText());

    }
}

