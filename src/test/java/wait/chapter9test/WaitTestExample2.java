package wait.chapter9test;

import base.BaseTest;
import com.seleniumPractice.pages.DynamicLoadingExample2Page;
import com.seleniumPractice.pages.DynamicLoadingPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTestExample2 extends BaseTest {
    @Test
    public void testWaitUntilAppears(){
        DynamicLoadingPage dynamicLoadingPage=homePage.clickDynamicLoadingPage();
        DynamicLoadingExample2Page dynamicLoadingExample2Page= dynamicLoadingPage.clickExample2();
        dynamicLoadingExample2Page.clickStartButton();
        assertEquals(dynamicLoadingExample2Page.getLoaderText()
                ,"Hello World!","Wrong output message");
    }
}
