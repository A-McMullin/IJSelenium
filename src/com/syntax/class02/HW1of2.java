package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1of2 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC05B0%22");
        driver.findElement(By.id("customer.firstName")).sendKeys("Billy");
        driver.findElement(By.id("customer.lastName")).sendKeys("Madison");
        driver.findElement(By.name("customer.address.street")).sendKeys("123 Main St");
        driver.findElement(By.name("customer.address.city")).sendKeys("Kansas City");
        driver.findElement(By.name("customer.address.state")).sendKeys("Missouri");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("64104");
        driver.findElement(By.name("customer.phoneNumber")).sendKeys("9876543210");
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.name("customer.username")).sendKeys("LookAtMyUserName");
        driver.findElement(By.id("customer.password")).sendKeys("ThisIsAPassword");
        driver.findElement(By.name("repeatedPassword")).sendKeys("ThisIsAPassword");
        Thread.sleep(1000);
        driver.findElement(By.className("button")).click();
        driver.close();
    }
}
