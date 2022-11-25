package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Main {
    public static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.shrome.driver", "C:\\Arthur\\Programmes\\Selenium\\selenium-java-4.6.0.zip");

        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        WebElement range = driver.findElement(By.name("my-range"));

        textBox.sendKeys("Arthur");
        //submitButton.click();
        //range.





        /*String title = driver.getTitle();*/
        //driver.quit();
    }
}