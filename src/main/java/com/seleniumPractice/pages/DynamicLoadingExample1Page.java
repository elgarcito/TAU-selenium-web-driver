package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingExample1Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start button");
    private By loadingBar=By.id("loading");
    private By finishMessage=By.id("finish");

    public DynamicLoadingExample1Page(WebDriver driver) {
        this.driver = driver;
    }

    public void clickStartButton(){
        driver.findElement(startButton).click();
        //Dynamic wait example
//        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.invisibilityOf(
//                driver.findElement(loadingBar)));
        FluentWait fluentWait =new FluentWait(driver)
                .withTimeout(Duration.ofSeconds(5))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        fluentWait.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingBar)
        ));
    }

    public String getLoaderText(){
        return driver.findElement(finishMessage).getText();
    }


}
