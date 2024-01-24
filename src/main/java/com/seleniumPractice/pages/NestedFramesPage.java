package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    private WebDriver driver;
    //private By frameUpperLeft= By.name("frame-left");
    //private By frameBottom= By.name("frame-bottom");
    private String frameBottom= "frame-bottom";
    private String frameTop="frame-top";
    private String frameUpperLefInsideFrameTop= "frame-left";
    private By body=By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToFrame(String frameId){
        driver.switchTo().frame(frameId);
    }

    private void leaveFrame(){
        driver.switchTo().parentFrame();
    }

    public String getTextFromBottom(){
        switchToFrame(frameBottom);
        String text= driver.findElement(body).getText();
        leaveFrame();
        leaveFrame();
        return text;
    }

    public String getTextFromUpperLeft(){
        switchToFrame(frameTop);
        switchToFrame(frameUpperLefInsideFrameTop);
        String text= driver.findElement(body).getText();
        leaveFrame();
        leaveFrame();
        leaveFrame();
        return text;
    }


}
