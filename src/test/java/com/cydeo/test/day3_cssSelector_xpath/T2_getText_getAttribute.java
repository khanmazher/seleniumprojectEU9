package com.cydeo.test.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com");
        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        if (actualRememberMeLabel.equals(expectedRememberMeLabel)){
            System.out.println("Label Verification PASSED");
        }else{
            System.out.println("Label Verification FAILED");
        }

        WebElement forgotPasswordLink = driver.findElement(By.className("login-link-forgot-pass"));

        String expectedForgotPasswordLinkText = "FORGOT YOUR PASSWORD?";
        String actualForgotPasswordLinkText = forgotPasswordLink.getText();
        if (actualForgotPasswordLinkText.equals(expectedForgotPasswordLinkText)){
            System.out.println("Forgot Password Link Verification PASSED");
        }else{
            System.out.println("Forgot Password Link Verification FAILED");
        }
        System.out.println("actualForgotPasswordLinkText = " + actualForgotPasswordLinkText);
        System.out.println("expectedForgotPasswordLinkText = " + expectedForgotPasswordLinkText);

        String expectedInHref = "forgot_password=yes";
        String actualHrefAttributeValue = forgotPasswordLink.getAttribute("href");
        if (actualHrefAttributeValue.contains(expectedInHref)){
            System.out.println("HREF attribute value verification PASSED");
        }else{
            System.out.println("HREF attribute value verification FAILED");
        }
        System.out.println("actualHrefAttributeValue = " + actualHrefAttributeValue);
        System.out.println("expectedInHref = " + expectedInHref);

        driver.close();






    }
}
