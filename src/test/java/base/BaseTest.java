package base;

import com.seleniumPractice.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        //driver.manage().window().setSize(new Dimension(375,812));
        homePage=new HomePage(driver);

        List<WebElement> webElements= driver.findElements(By.tagName("a"));
        //webElements.forEach(x-> System.out.println(x.getText()));

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    public static void main(String[] args) {
//        BaseTest test =new BaseTest();
//        test.setUp();
//    }

}
