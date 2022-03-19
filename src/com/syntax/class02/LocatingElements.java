package com.syntax.class02;

import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingElements {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("billiambrasky20@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("egamps02");
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000); // need to add the throws exception on the Main
        //driver.findElement(By.linkText("Forgot password?")).click();
        driver.findElement(By.partialLinkText("Forgot")).click();
    }
}
