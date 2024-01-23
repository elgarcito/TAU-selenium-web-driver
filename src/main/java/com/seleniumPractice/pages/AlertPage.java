package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By triggerForJsAlert= By.cssSelector("button[onclick=\"jsAlert()\"]");
    private By resultFromAlert=By.id("result");
    private By triggerForJsConfirm=By.cssSelector("button[onclick=\"jsConfirm()\"]");
    private By triggerForJsPrompt=By.cssSelector("button[onclick=\"jsPrompt()\"]");
    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    public void triggerForJsAlert(){
        driver.findElement(triggerForJsAlert).click();
    }

    public void alertClickToAccept(){
        driver.switchTo().alert().accept();
    }

    public String getResultMessage(){
        return driver.findElement(resultFromAlert).getText();
    }

    public void triggerForConfirm(){
        driver.findElement(triggerForJsConfirm).click();
    }

    public String alertGetText(){
        return driver.switchTo().alert().getText();
    }
    public void alertClickToDismiss(){
        driver.switchTo().alert().dismiss();
    }

    public void triggerForJsPrompt(){
        driver.findElement(triggerForJsPrompt).click();
    }
    public void alertSetMessage(String message){
        driver.switchTo().alert().sendKeys(message);
        driver.switchTo().alert().accept();
    }


}
