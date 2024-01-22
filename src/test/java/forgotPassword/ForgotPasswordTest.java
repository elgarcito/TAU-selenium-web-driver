package forgotPassword;

import base.BaseTest;
import com.seleniumPractice.pages.CorrectEmailPage;
import com.seleniumPractice.pages.ForgotPasswordPage;
import com.seleniumPractice.pages.HomePage;
import com.seleniumPractice.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ForgotPasswordTest extends BaseTest {

    @Test
    public void testSendEmail(){
        ForgotPasswordPage forgotPasswordPage= homePage.clickForgotPasswordPage();
        CorrectEmailPage correctEmailPage= forgotPasswordPage
                .insertCorrectEmail("TAU@example.com");
        assertEquals(correctEmailPage.getCorrectEmailMessage(),"Your e-mail's been sent!","Message in wrong");
    }
}
