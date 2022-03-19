package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); //first argument is built in value

        WebDriver webDriver=new ChromeDriver();
        webDriver.get("https://www.google.com");
        String url = webDriver.getCurrentUrl();
        System.out.println(url);
        String title = webDriver.getTitle();
        System.out.println(title);
        webDriver.quit();
    }
}
