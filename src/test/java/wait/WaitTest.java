package wait;

import base.BaseTest;
import com.seleniumPractice.pages.DynamicLoadingExample1Page;
import com.seleniumPractice.pages.DynamicLoadingPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTest extends BaseTest {
    @Test
    public void testWaitUntilHidden(){
        DynamicLoadingPage dynamicLoadingPage =homePage.clickDynamicLoadingPage();
        DynamicLoadingExample1Page dynamicLoadingExample1Page= dynamicLoadingPage.clickExample1();
        dynamicLoadingExample1Page.clickStartButton();
        String text= dynamicLoadingExample1Page.getLoaderText();
        assertEquals(text,"Hello World!","Wrong output message");
    }
}
