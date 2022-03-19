package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2of2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(3000);
        driver.findElement(By.name("firstname")).sendKeys("Ivanna");
        driver.findElement(By.name("lastname")).sendKeys("GoHome");
        driver.findElement(By.name("reg_email__")).sendKeys("Ivanna.GoHome@yahoo.com");
        driver.findElement(By.name("reg)passwd__")).sendKeys("ThePasswordIsPassword");

    }
}
