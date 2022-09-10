package com.cydeo.test.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/com?forgot_password=yes");

        WebElement resetPasswordButton = driver.findElement(By.cssSelector("button[value='Reset password']"));
        String expectedResetPasswordButtonText = "Reset password";
        String actualResetPasswordButtonText = resetPasswordButton.getText();
        System.out.println("actualResetPasswordButtonText = " + actualResetPasswordButtonText);

        if (actualResetPasswordButtonText.equals(expectedResetPasswordButtonText)){
            System.out.println("Log In button text verification PASSED");
        }else{
            System.out.println("Log In button text verification FAILED");
        }

        driver.close();
    }
}
