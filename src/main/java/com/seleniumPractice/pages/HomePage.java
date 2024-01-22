package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By formAuthenticationLink = By.linkText("Form Authentication");

    public LoginPage clickFormAuthentication(){
        this.driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
