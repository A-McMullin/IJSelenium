package com.syntax.class06HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class class06HW1 {

    /*
    Navigate to https://syntaxprojects.com/bootstrap-iframe.php
verify the header text AUTOMATION TESTING PLATFORM BY SYNTAX is displayed
verify enroll today button is enabled

     */

    public static String url = "https://syntaxprojects.com/bootstrap-iframe.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement header = driver.findElement(By.cssSelector("span.gum"));
        boolean isheaderDisplayed = header.isDisplayed();
        if (!isheaderDisplayed) {
            System.out.println("Not displayed");
        } else {
            System.out.println("Is displayed");
        }
        driver.switchTo().frame("FrameTwo");
        if (driver.findElement(By.linkText("Enroll today")).isDisplayed()) {
            System.out.println("Enroll Today button is Displayed");
        } else {
            System.out.println("Enroll Today button is NOT Displayed");
        }
    }
}
