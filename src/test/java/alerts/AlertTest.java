package alerts;

import base.BaseTest;
import com.seleniumPractice.pages.AlertPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AlertTest extends BaseTest {
    @Test
    public void testAcceptAlert(){
        AlertPage alertPage=homePage.clickJavaScriptAlerts();
        alertPage.triggerForJsAlert();
        alertPage.alertClickToAccept();
        assertEquals(alertPage.getResultMessage(),"You successfully clicked an alert","Result text are incorrect");
    }

    @Test
    public void testGetTextFromAlert(){
        AlertPage alertPage=homePage.clickJavaScriptAlerts();
        alertPage.triggerForConfirm();
        String text= alertPage.alertGetText();
        alertPage.alertClickToDismiss();
        assertEquals(text,"I am a JS Confirm","Alert text incorrect");
    }

    @Test
    public void testGetMessageFromPrompt(){
        AlertPage alertPage=homePage.clickJavaScriptAlerts();
        alertPage.triggerForJsPrompt();
        String text="You rock!";
        alertPage.alertSetMessage(text);
        assertEquals(alertPage.getResultMessage(),"You entered: "+text,"Prompt message incorrect");
    }
}
