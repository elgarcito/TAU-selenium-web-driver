package chapter11exercise;

import base.BaseTest;
import com.seleniumPractice.pages.DropdownPage;
import com.seleniumPractice.pages.DynamicLoadingPage;
import org.testng.annotations.Test;

import javax.swing.*;

public class DynamicLoadingNavigationTest extends BaseTest {
    @Test
    public void clickAndCheckTabWindowButton(){
        homePage.clickDynamicLoadingPage().openLink2InNewTab();
    }
}
