package chapter7test;

import base.BaseTest;
import com.seleniumPractice.pages.ContextMenuPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTest {
    @Test
    public void testAlertTextInContextMenu(){
        ContextMenuPage contextMenuPage=homePage.clickContextMenuPage();
        contextMenuPage.rightClickBox();
        String alertText= contextMenuPage.alertGetText();
        contextMenuPage.acceptAlert();
        assertEquals(alertText,"You selected a context menu","The alert message is wrong");
    }
}
