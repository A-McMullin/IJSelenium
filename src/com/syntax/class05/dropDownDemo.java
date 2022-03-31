package com.syntax.class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropDownDemo {

    public static String url = "https://www.syntaxprojects.com/basic-select-dropdown-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        WebElement dayDD = driver.findElement(By.id("select-demo"));
        Select select = new Select(dayDD);
        select.selectByIndex(3);
        Thread.sleep(2000);

        select.selectByVisibleText("Thursday");
        Thread.sleep(1000);

        select.selectByValue("Sunday");

        List<WebElement> allOptions = select.getOptions(); //grabs the text and puts them in a list
        int size = allOptions.size();
        System.out.println(size);

        for(int i=1; i<size; i++){  //interates through the index of the elements
            String option = allOptions.get(i).getText();
            System.out.println(option); //printing the text from the index

            select.selectByIndex(i); //cycles through the selection of the index
            Thread.sleep(1000);
        }
    }
}
