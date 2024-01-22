package login;

import base.BaseTest;
import com.seleniumPractice.pages.LoginPage;
import com.seleniumPractice.pages.SecureAreaPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage= homePage.clickFormAuthentication();
        loginPage.setUserNameField("tomsmith");
        loginPage.setPasswordField("SuperSecretPassword!");
        SecureAreaPage secureAreaPage= loginPage.clickLoginButtonCorrectCredentials();
        /*
        assertEquals(secureAreaPage.getLoginText(),
                "You logged into a secure area!\\n×",
                "Alert text is incorrect");
         */
        assertTrue(secureAreaPage.getLoginText().contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
