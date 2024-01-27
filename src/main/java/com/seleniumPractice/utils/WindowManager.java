package com.seleniumPractice.utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver) {
        this.driver = driver;
        this.navigate=driver.navigate();
    }

    public void goBack(){
        navigate.back();
    }

    public void goForward(){
        navigate.forward();
    }

    public void refreshPage(){
        navigate.refresh();
    }

    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(String tabTitle){
        Set<String> windows= driver.getWindowHandles();
        System.out.println(String.format("number of tabs: %s", windows.size()));
        System.out.println("Windows handles");
        windows.forEach(x-> System.out.println(x));
        for(String window:windows){
            System.out.println(String.format("Switching to window: %s",window));
            driver.switchTo().window(window);
            System.out.println(String.format("Current window title: %s",driver.getTitle()));
            if(tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
