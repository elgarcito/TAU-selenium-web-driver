package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By userNameField=By.id("username");
    private By passwordField=By.id("password");

    private By loginField=By.cssSelector("#login button");

    public void setUserNameField(String userName){
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).sendKeys(password);
    }

    public SecureAreaPage clickLoginButtonCorrectCredentials(){
        driver.findElement(loginField).click();
        return new SecureAreaPage(this.driver);
    }
}
