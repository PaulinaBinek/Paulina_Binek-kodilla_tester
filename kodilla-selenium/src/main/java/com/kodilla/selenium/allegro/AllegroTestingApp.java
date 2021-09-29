package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\selenium-drivers\\Chrome\\chromedriver.exe");      // [1]
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.allegro.pl/");

        WebElement cookies = driver.findElement(By.xpath("/html/body/div[2]/div[8]/div/div/div/div/div[2]/div[2]/button[1]"));
        cookies.click();

        WebElement dropDown = driver.findElement(By.xpath("//*[@data-role=\"filters\"]/div/select")); // "//*[@data-role=\"filters\"]/div/select" /html/body/div[2]/div[4]/header/div/div/div[1]/div/form/div[3]/div/select
        Select electricSelect = new Select(dropDown);
        electricSelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//*[contains(@data-prototype-id, \"metrumHeader\")]/div/form/input")); // "//*[contains(@data-prototype-id, "metrumHeader")]/div/form/input" "/html/body/div[2]/div[4]/header/div/div/div[1]/div/form/input"
        inputField.sendKeys("Mavic mini");

        WebElement searchButton = driver.findElement(By.xpath("//*[@data-prototype-id=\"allegro.metrumHeader.search\"]/div/form/button")); // "//*[contains(@data-analytics-groups, \"allegro.header\")]div/form/button" /html/body/div[2]/div[3]/header/div[1]/div/div[1]/div/form/button // data-analytics-groups allegro.metrumHeader.search
        searchButton.click();
    }
}

