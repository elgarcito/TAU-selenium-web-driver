package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
    private WebDriver driver;
    private String editorIframeId="mce_0_ifr";
    private By textArea= By.id("tinymce");
    private By decreaseIndentButton=By.cssSelector("button[aria-label=\"Increase indent\"]");

    public WysiwygEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    //We enter into the frame area
    private void switchToEditArea(){
        driver.switchTo().frame(editorIframeId);
    }

    //We exit the frame area.Main area is parent frame
    private void switchToMainArea(){
        driver.switchTo().parentFrame();
    }

    //To every frame area we get in and then we got out in every action
    public void cleanTextArea(){
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }
    public void decreaseIndention(){
        driver.findElement(decreaseIndentButton).click();
    }
    public String getTextOfEditor(){
        switchToEditArea();
        String text= driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

}
