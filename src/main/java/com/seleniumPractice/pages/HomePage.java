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

}
