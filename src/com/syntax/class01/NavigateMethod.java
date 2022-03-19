package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.amazon.com/"); //will re-direct to this site
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        //driver.close() - will close the current tab
        //driver.quit() - will close the entire browser
        //thread.sleep(specify time in ms) - pauses execution


    }
}
