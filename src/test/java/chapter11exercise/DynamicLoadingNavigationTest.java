package chapter11exercise;

import base.BaseTest;
import com.seleniumPractice.pages.DropdownPage;
import com.seleniumPractice.pages.DynamicLoadingExample2Page;
import com.seleniumPractice.pages.DynamicLoadingPage;
import org.testng.annotations.Test;

import javax.swing.*;

import static org.testng.Assert.assertEquals;

public class DynamicLoadingNavigationTest extends BaseTest {
    @Test
    public void clickAndCheckTabWindowButton(){
        DynamicLoadingExample2Page dynamicLoadingExample2Page= homePage
                .clickDynamicLoadingPage()
                .openLink2InNewTab();
        getWindowManager().switchToNewTab();
        assertEquals(dynamicLoadingExample2Page.getStartButtonText(),"Start","Wrong button nameTag");
    }
}
