package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class KeyPressesPage {
    private WebDriver driver;
    private By inputField= By.id("target");
    private By resultField= By.id("result");
    public KeyPressesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void enterKey(String text){
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi(){
        enterKey(Keys.chord(Keys.ALT,"227"));
        /*
        try {
            Robot robot =new Robot();
            robot.keyPress(KeyEvent.VK_ALT);
            robot.keyPress(227);
            robot.keyRelease(KeyEvent.VK_ALT);
            robot.keyRelease(227);
        } catch (AWTException e) {
            throw new RuntimeException(e);
        }

         */
    }

    public String getResult(){
        return driver.findElement(resultField).getText();
    }
}
