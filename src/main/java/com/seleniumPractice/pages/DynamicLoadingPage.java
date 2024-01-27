package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v118.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpathFormat=".//a[contains(text(),'%s')]";
    private By linkExample1= By.xpath(String.format(linkXpathFormat,"Example 1"));
    private By linkExample2= By.xpath(String.format(linkXpathFormat,"Example 2"));

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingExample1Page clickExample1(){
        driver.findElement(linkExample1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public void openLink2InNewTab(){
        driver.findElement(linkExample2).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
    }
}
