package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //private By formAuthenticationLink = By.linkText("Form Authentication");

    public LoginPage clickFormAuthentication(){
        //this.driver.findElement(formAuthenticationLink).click();
        clinkLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropDown(){
        clinkLink("Dropdown");
        return new DropdownPage(driver);
    }

    private void clinkLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public HoversPage clickHovers(){
        clinkLink("Hovers");
        return new HoversPage(driver);
    }

    public KeyPressesPage clickKeyPressesPage(){
        clinkLink("Key Presses");
        return new KeyPressesPage(driver);
    }

    public AlertPage clickJavaScriptAlerts(){
        clinkLink("JavaScript Alerts");
        return new AlertPage(driver);
    }

    public FileUploadPage clickFileUploadPage(){
        clinkLink("File Upload");
        return new FileUploadPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditorPage(){
        clinkLink("WYSIWYG Editor");
        return new WysiwygEditorPage(driver);
    }

    public DynamicLoadingPage clickDynamicLoadingPage(){
        clinkLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }

    public ModalPage clickModalPage(){
        clinkLink("Entry Ad");
        return new ModalPage(driver);
    }
}
