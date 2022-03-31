package com.syntax.class05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class class05task2 {
    //HW1
    //Go to facebook sign up page
    //Fill out the whole form
    //Click signup
    public static String url = "http://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement button = driver.findElement(By.linkText("Create new account"));
        button.click();

        Thread.sleep(1000);

        WebElement firstName = driver.findElement(By.name("firstname"));
        firstName.sendKeys("Doc");
        WebElement lastName = driver.findElement(By.name("lastname"));
        lastName.sendKeys("Holiday");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("DocHoliday@gmail.com");
        WebElement confEmail = driver.findElement(By.name("reg_email_confirmation__"));
        confEmail.sendKeys("DocHoliday@gmail.com");
        WebElement emailPass = driver.findElement(By.name("reg_passwd__"));
        emailPass.sendKeys("ThisisAnEmailPassword");

        WebElement monthDD = driver.findElement(By.id("month"));
        Select month = new Select(monthDD);
        month.selectByValue("10");

        WebElement dayDD = driver.findElement(By.id("day"));
        Select day = new Select(dayDD);
        day.selectByVisibleText("15");

        WebElement yearDD = driver.findElement(By.id("year"));
        Select year = new Select(yearDD);
        year.selectByVisibleText("1996");

        WebElement genderRadio = driver.findElement(By.id("u_2_5_nm"));
        genderRadio.click();
        WebElement submit = driver.findElement(By.name("websubmit"));
        submit.click();
    }
}
