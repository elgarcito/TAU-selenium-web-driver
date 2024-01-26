package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ModalPage {
    private WebDriver driver;
    public ModalPage(WebDriver driver) {
        this.driver = driver;
    }
    private By modalAd= By.id("modal");
    private By modalAdTittle= By.cssSelector("div>div[class=\"modal-title\"]");

    public boolean checkModalAdAppears(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalAd)));
        return driver.findElement(modalAd).isDisplayed();
    }

    public String getModalAdTittle(){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalAdTittle)));
       return driver.findElement(modalAdTittle).getText();
    }

}
