package com.syntax.class06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

    public static String url = "http://www.uitestpractice.com/Students/Switchto";

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.manage().window().maximize();
        Thread.sleep(1000);

        WebElement alertButton = driver.findElement(By.id("alert"));
        alertButton.click();
        Thread.sleep(1000);

        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept(); //use this if the only option is to click 'OK'

        WebElement confirmButton = driver.findElement(By.id("confirm"));
        confirmButton.click();
        Thread.sleep(1000);

        Alert confirmAlert = driver.switchTo().alert();
        String alertText = confirmAlert.getText();
        System.out.println(alertText);
        confirmAlert.dismiss();

        WebElement promptButton = driver.findElement(By.cssSelector("button#prompt"));
        promptButton.click();
        Thread.sleep(1000);
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.sendKeys("Batch 12 is the best");
        promptAlert.accept();


    }
}
