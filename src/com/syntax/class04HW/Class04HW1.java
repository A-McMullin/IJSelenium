package com.syntax.class04HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class04HW1 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("Admin");
        WebElement passWord = driver.findElement(By.cssSelector("input[name='txtPassword']"));
        passWord.sendKeys("Hum@nhrm123");

        WebElement login = driver.findElement(By.cssSelector("input[name='Submit']"));
        login.click();

        WebElement display = driver.findElement(By.cssSelector("img[width]"));
        boolean isSyntaxDisplayed = display.isDisplayed();
        System.out.println(isSyntaxDisplayed);

    }
}
