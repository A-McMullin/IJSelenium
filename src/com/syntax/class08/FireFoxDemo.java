package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxDemo {

    static String url = "https://demoqa.com/browser-windows";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        WebElement newWindowButton = driver.findElement(By.id("windowButton"));
        WebElement newMessageButton = driver.findElement(By.id("messageWindowButton"));

        newTabButton.click();
        newWindowButton.click();
        newMessageButton.click();
    }
}

