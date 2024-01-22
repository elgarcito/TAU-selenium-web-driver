package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CorrectEmailPage {
    private WebDriver driver;
    private By correctMessage= By.id("content");

    public CorrectEmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getCorrectEmailMessage(){
        return driver.findElement(correctMessage).getText();
    }
}
