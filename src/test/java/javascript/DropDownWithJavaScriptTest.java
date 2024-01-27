package javascript;

import base.BaseTest;
import com.seleniumPractice.pages.DropdownPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDownWithJavaScriptTest extends BaseTest {
    @Test
    public void selectMultipleWithJavaScript(){
        DropdownPage dropdownPage=homePage.clickDropDown();
        dropdownPage.javaScriptSelectMultiple();
        assertEquals(dropdownPage.getOptionOneText(),"Option 1","Wrong option 1 text");
        assertEquals(dropdownPage.getOptionTwoText(),"Option 2","Wrong option 2 text");
    }
}
