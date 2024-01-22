package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
   private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    private By emailInput= By.id("email");
    private By retrievePasswordButton= By.id("form_submit");

    public CorrectEmailPage insertCorrectEmail(String email){
        driver.findElement(emailInput).sendKeys(email);
        driver.findElement(retrievePasswordButton).click();
        return new CorrectEmailPage(driver);
    }
}
