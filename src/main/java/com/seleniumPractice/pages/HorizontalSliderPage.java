package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By inputSlider =By.cssSelector("input[type=\"range\"]");
    private By sliderValue=By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void slideRight(double objective) {
        double value;
        do {
            driver.findElement(inputSlider).sendKeys(Keys.ARROW_RIGHT);
            if (getSliderValue()==5) break;
        } while (getSliderValue() != objective);
    }

    public double getSliderValue(){
        return Double.parseDouble(driver.findElement(sliderValue).getText());
    }

}
