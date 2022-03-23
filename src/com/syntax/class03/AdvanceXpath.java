package com.syntax.class03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        //input[@id='calFromDate']/following-sibling::img - example to locate calendar after logged in
        //locates the 'id' from the line closest to the 'target' with a unique enough identifying factor.

        //tagname[@attribute='attribute value']/proceeding-sibling::(tagname)-unique identifier of previous line

        /*
        identify elements by parents
        //tagname[@attribute='attribute value']/parent::parent tagname
        looks for the parent line for the child line noted in the first tagname

        identify elements by ancestor
        //tagname[@attribute='attribute value']/ancestor::ancestor tagname
        looks for anything above the parent will be ancestor
         */
    }
}
