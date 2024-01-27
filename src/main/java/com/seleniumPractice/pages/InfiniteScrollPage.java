package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class InfiniteScrollPage {
    private WebDriver driver;
    private By textBlocks=By.cssSelector("div[class=\"jscroll-inner\"]>div[class=\"jscroll-added\"]");

    public InfiniteScrollPage(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * scrolls until paragraph with index specified in view
     * @param index 1-Based
     */
    public void scrollToParagraph(int index){
        String script="window.scrollTo(0,document.body.scrollHeight)";
        var jsExecutor= (JavascriptExecutor)driver;
        while (getNumberOfParagraphsPresent()<index){
            jsExecutor.executeScript(script);
        }
    }

    private int getNumberOfParagraphsPresent(){
        int index =driver.findElements(textBlocks).size();
        return driver.findElements(textBlocks).size();
    }
}
