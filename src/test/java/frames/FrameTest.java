package frames;

import base.BaseTest;
import com.seleniumPractice.pages.WysiwygEditorPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTest extends BaseTest {
    @Test
    public void testWysiwyg(){
        WysiwygEditorPage wysiwygEditorPage =homePage.clickWysiwygEditorPage();
        wysiwygEditorPage.cleanTextArea();
        String text1="Hello ";
        String text2="Mondo";
        wysiwygEditorPage.setTextArea(text1);
        wysiwygEditorPage.decreaseIndention();
        wysiwygEditorPage.setTextArea(text2);
        assertEquals(wysiwygEditorPage.getTextOfEditor(),text1+text2,"Wrong message");
    }
}
