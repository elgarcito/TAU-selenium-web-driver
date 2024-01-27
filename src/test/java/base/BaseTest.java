package base;

import com.seleniumPractice.pages.HomePage;
import com.seleniumPractice.utils.WindowManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        //wait amount of time to a page to load until complete before throw an error
        //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        //Only wait the amount of time given
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        goHome();
        //driver.manage().window().setSize(new Dimension(375,812));
        homePage=new HomePage(driver);

        List<WebElement> webElements= driver.findElements(By.tagName("a"));
        //webElements.forEach(x-> System.out.println(x.getText()));

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    public static void main(String[] args) {
//        BaseTest test =new BaseTest();
//        test.setUp();
//    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

}
