package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;
    private By inputField =By.id("file-upload");
    private By uploadButton =By.id("file-submit");
    private By uploadedFile =By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickChooseFileButton(){
        driver.findElement(inputField).click();
    }

    public void uploadFile(String absolutePathOfFile){
        driver.findElement(inputField).sendKeys(absolutePathOfFile);
        clickFileUploadButton();
    }
    public void clickFileUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFile).getText();
    }
}
