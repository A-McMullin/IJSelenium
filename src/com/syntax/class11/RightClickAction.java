package com.syntax.class11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAction {

    public static String url = "https://demo.guru99.com/test/simple_context_menu.html";

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).perform();
        WebElement editOption = driver.findElement(By.xpath("//span[text()='Edit']"));
        //editOption.click(); // this is the preferred click method
        action.click(editOption).perform(); //this is an alternative path to click the edit option if not working
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        alert.accept();

    }
}
