package com.cydeo.test.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");

        //we have to locate check boxes

        WebElement checkbox1 = driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@name='checkbox2']"));

        //confirming checkbox 1 is not selected
        System.out.println("checkbox1.isSelected(), expecting false = " + checkbox1.isSelected());
        //confirming checkbox 2 is selected
        System.out.println("checkbox2.isSelected(), expecting true = " + checkbox2.isSelected());

        //wait for 2 seconds and select checkbox 1
        Thread.sleep(2000);
        checkbox1.click();

        //wait for 2 seconds and de-select checkbox 2
        Thread.sleep(2000);
        checkbox2.click();

        //confirming checkbox 1 is selected
        System.out.println("checkbox1.isSelected(), expecting true = " + checkbox1.isSelected());
        //confirming checkbox 2 is not selected
        System.out.println("checkbox2.isSelected(), expecting false = " + checkbox2.isSelected());

        driver.close();





    }
}
