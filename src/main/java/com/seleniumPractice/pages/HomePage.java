package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //private By formAuthenticationLink = By.linkText("Form Authentication");
    private By forgotPasswordLink=By.linkText("Forgot Password");

    public LoginPage clickFormAuthentication(){
        //this.driver.findElement(formAuthenticationLink).click();
        clinkLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        clinkLink("Dropdown");
        return new DropdownPage(driver);
    }

    private void clinkLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public ForgotPasswordPage clickForgotPasswordPage(){
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }

}
