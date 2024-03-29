package base;

import com.seleniumPractice.pages.HomePage;
import com.seleniumPractice.utils.EventReporter;
import com.seleniumPractice.utils.WindowManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    //private WebDriver driver;
    private EventFiringWebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        //driver = new ChromeDriver();
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReporter());
        //wait amount of time to a page to load until complete before throw an error
        //driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        //Only wait the amount of time given
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        goHome();
        //driver.manage().window().setSize(new Dimension(375,812));
        //homePage=new HomePage(driver);

        //List<WebElement> webElements= driver.findElements(By.tagName("a"));
        //webElements.forEach(x-> System.out.println(x.getText()));
        setCookie();

    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
        homePage=new HomePage(driver);
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

//    public static void main(String[] args) {
//        BaseTest test =new BaseTest();
//        test.setUp();
//    }

    /* Take screenshot after each test
    @AfterMethod
    public void takeScreenshot(){
        var camera=(TakesScreenshot)driver;
        File screenshot=camera.getScreenshotAs(OutputType.FILE);
        //System.out.println(String.format("Screenshot taken: %s",screenshot.getAbsoluteFile()));
        try {
            Files.move(screenshot.toPath(), new File("src/main/resources/screenshots/test.png").toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

     */

    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            //System.out.println(String.format("Screenshot taken: %s",screenshot.getAbsoluteFile()));
            try {
                Files.move(screenshot.toPath(), new File(String.format("src/main/resources/screenshots/%s.png",result.getName()))
                        .toPath());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options= new ChromeOptions();
        //options.addArguments("disable-infobars");
        options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);
        return options;
    }

    private void setCookie(){
        Cookie cookie=new Cookie.Builder("Tau","123")
                .domain("the-internet.herokuapp.com")
                .build();
        driver.manage().addCookie(cookie);
    }

}
