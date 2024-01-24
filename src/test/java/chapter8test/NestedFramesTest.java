package chapter8test;

import base.BaseTest;
import com.seleniumPractice.pages.NestedFramesPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFramesTest extends BaseTest {
    @Test
    public void testMessagesInNestedFrames(){
        NestedFramesPage nestedFramesPage=homePage.clickNestedFramesPage();
        assertEquals(nestedFramesPage.getTextFromBottom(),"BOTTOM","Wrong tag value displayed");
        assertEquals(nestedFramesPage.getTextFromUpperLeft(),"LEFT","Wrong tag value displayed");
    }
}
