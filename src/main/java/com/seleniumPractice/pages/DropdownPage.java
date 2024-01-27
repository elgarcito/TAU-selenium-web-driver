package com.seleniumPractice.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropdownPage {
    private WebDriver driver;
    private By dropdown = By.id("dropdown");
    private By option1=By.cssSelector("option[value=\"1\"]");
    private By option2=By.cssSelector("option[value=\"2\"]");

    public DropdownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String option) {
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions() {
        List<WebElement> webElementList = findDropDownElement().
                getAllSelectedOptions();
        return webElementList.stream()
                .map(e -> e.getText())
                .collect(Collectors.toList());
    }

    private Select findDropDownElement() {
        return new Select(driver.findElement(dropdown));
    }

    public void javaScriptSelectMultiple() {
        WebElement element= driver.findElement(dropdown);
        String script = "arguments[0].setAttribute('multiple', '')";
        var jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript(script,element);
    }

    public String getOptionOneText(){
       return driver.findElement(option1).getText();
    }

    public String getOptionTwoText(){
        return driver.findElement(option2).getText();
    }
}
