package alerts;

import base.BaseTest;
import com.seleniumPractice.pages.FileUploadPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTest extends BaseTest {
    @Test
    public void testFileUpload(){
    FileUploadPage fileUploadPage=homePage.clickFileUploadPage();
    fileUploadPage.uploadFile("C:\\Users\\edgar\\IdeaProjects\\selenium-practice\\src\\test\\resources\\chromedriver.exe");
    String fileName="chromedriver.exe";
    assertEquals(fileUploadPage.getUploadedFiles(),fileName,"File name incorrect");
    }
}
