package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {
        //1- set up the "browser driver"
        WebDriverManager.chromedriver().setup();

        //2- Create instance of the selenium WebDriver
        //This is the line opening empty browser for us
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //3- Go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        //get title of the page
        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate refresh
        driver.navigate().refresh();

        //Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        //get current title after going to google
        currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        //get current URL using selenium
        currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        //









    }
}
