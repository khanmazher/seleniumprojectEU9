package com.cydeo.test.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T4_findElements {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/abtest");

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement each : allLinks) {
            System.out.println("Text of link: " + each.getText());
            System.out.println("HREF Values: " + each.getText());


        }



    }
}
