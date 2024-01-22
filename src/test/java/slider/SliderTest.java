package slider;

import base.BaseTest;
import com.seleniumPractice.pages.HorizontalSliderPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTest {
    @Test
    public void moveSliderToValue(){
        HorizontalSliderPage horizontalSliderPage=homePage.clickHorizontalSliderPage();
        horizontalSliderPage.slideRight(4.1);
        assertEquals(horizontalSliderPage.getSliderValue(),4,"Not the desired value");
    }
}
