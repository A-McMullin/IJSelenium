package com.syntax.class05HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class class05Task1 {

    //TC 1: Facebook dropdown verification
    //Open chrome browser
    //Go to "https://www.facebook.com"
    //click on create new account
    //Verify:
    //month dd has 12 month options
    //day dd has 31 day options
    //year dd has 115 year options
    //Select your date of birth
    //Quit browser

    public static String url = "http://www.facebook.com";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement button = driver.findElement(By.linkText("Create new account"));
        button.click();

        Thread.sleep(1500);

        WebElement monthDD = driver.findElement(By.id("month"));
        Select month = new Select(monthDD);
        month.selectByValue("1");
        List<WebElement> monthOptions = month.getOptions();
        int sizeM = monthOptions.size();
        System.out.println("Total months: "+sizeM);

        WebElement dayDD = driver.findElement(By.id("day"));
        Select day = new Select(dayDD);
        day.selectByVisibleText("30");
        List<WebElement> dayOptions = day.getOptions();
        int sizeD = dayOptions.size();
        System.out.println("Total days: "+sizeD);

        WebElement yearDD = driver.findElement(By.id("year"));
        Select year = new Select(yearDD);
        year.selectByVisibleText("1982");
        List<WebElement> yearOptions = year.getOptions();
        int sizeY = yearOptions.size();
        System.out.println("Total years: "+sizeY);

        driver.quit();
}
}