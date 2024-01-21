package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class BaseTest {
    private WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().window().setSize(new Dimension(375,812));

        List<WebElement> webElements= driver.findElements(By.tagName("a"));
        //webElements.forEach(x-> System.out.println(x.getText()));

        // Chapter 3 finding web elements. Solution.
        WebElement inputLink= driver.findElement(By.cssSelector("a[href=\"/shifting_content\"]"));
        inputLink.click();
        WebElement menuList= driver.findElement(By.cssSelector("a[href=\"/shifting_content/menu\"]"));
        menuList.click();
        List<WebElement> webElements1=driver.findElements(By.cssSelector("ul>li>a"));
        System.out.println((long) webElements1.size());
        System.out.println(driver.getTitle());
        driver.quit();
    }


    public static void main(String[] args) {
        BaseTest test =new BaseTest();
        test.setUp();
    }
}
