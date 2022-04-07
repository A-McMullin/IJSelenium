package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Class08Task1 {

    /*
     *  navigate http://syntaxprojects.com/dynamic-elements-loading.php
     *  click on start button
     *  get the text
     *  print out in console
     */

    static String url = "http://syntaxprojects.com/dynamic-elements-loading.php";

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement startButton = driver.findElement(By.id("startButton"));
        startButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h4[contains(text(),'Syntax')]")));

        WebElement getText = driver.findElement(By.xpath("//*[contains(text(), 'Welcome')]"));
        System.out.println(getText.getText());
    }
}
