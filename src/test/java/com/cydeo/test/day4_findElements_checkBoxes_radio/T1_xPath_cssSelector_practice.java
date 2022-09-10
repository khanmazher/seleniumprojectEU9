package com.cydeo.test.day4_findElements_checkBoxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xPath_cssSelector_practice {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        //cssSelector class value
        WebElement homeLink1_ex1 = driver.findElement(By.cssSelector("a[class='nav-link']"));
        //cssSelector syntax# 2
        WebElement homeLink1_ex2 = driver.findElement(By.cssSelector("a.nav-link"));
        //cssSelector href value
        WebElement homeLink1_ex3 = driver.findElement(By.cssSelector("a[href='/']"));

        //using cssSelector locator
        WebElement header_ex1 = driver.findElement(By.cssSelector("div.example>h2"));
        //using xPath locator
        //WebElement header_ex2 = driver.findElement(By.cssSelector("//h2[text()='Forgot Password']"));
        //or
        //WebElement header_ex2 = driver.findElement(By.cssSelector("//h2[.='Forgot Password']"));

        WebElement emailLabel = driver.findElement(By.xpath("//label[@for='email']"));

        WebElement inputBox_ex1 = driver.findElement(By.xpath("//input[@name='email']"));
        WebElement inputBox_ex2 = driver.findElement(By.xpath("//input[contains(@pattern,'0-9')]"));

        WebElement retrievePasswordButton = driver.findElement(By.xpath("//button[@id='form_submit']"));

        WebElement poweredByCydeoText = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

        System.out.println("homeLink1_ex1.isDisplayed() = " + homeLink1_ex1.isDisplayed());
        System.out.println("header_ex1.isDisplayed() = " + header_ex1.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputBox_ex1.isDisplayed() = " + inputBox_ex1.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByCydeoText.isDisplayed() = " + poweredByCydeoText.isDisplayed());

        driver.close();




    }
}
