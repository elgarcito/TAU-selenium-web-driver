package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class ContextMenuPage {
    private WebDriver driver;
    private By box= By.id("hot-spot");


    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void rightClikBox(){
        WebElement elementBox= driver.findElement(box);
        Actions actions=new Actions(driver);
        actions.moveToElement(elementBox).contextClick().perform();
    }

    public String alertGetText(){
        return driver.switchTo().alert().getText();
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }
}
