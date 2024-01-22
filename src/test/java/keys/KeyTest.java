package keys;

import base.BaseTest;
import com.seleniumPractice.pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class KeyTest extends BaseTest {

    @Test
    public void testBackSpace(){
        KeyPressesPage keyPressesPage=homePage.clickKeyPressesPage();
        keyPressesPage.enterKey("A"+ Keys.BACK_SPACE);
        assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE","Backspace is not pressed");
    }

    @Test
    public void testPi(){
        KeyPressesPage keyPressesPage=homePage.clickKeyPressesPage();
        keyPressesPage.enterPi();
    }
}
