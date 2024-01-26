package modal;

import base.BaseTest;
import com.seleniumPractice.pages.ModalPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ModalTest extends BaseTest {
    @Test
    public void checkModalExistAndGetMessage(){
        ModalPage modalPage=homePage.clickModalPage();
        assertTrue(modalPage.checkModalAdAppears(),"Modals doesn´t appear properly");
        String expectedText="THIS IS A MODAL WINDOW";
        assertEquals(modalPage.getModalAdTittle(),expectedText,"Tittle didn't appear properly");
    }
}
