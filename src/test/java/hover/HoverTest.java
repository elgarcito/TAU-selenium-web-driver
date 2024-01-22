package hover;

import base.BaseTest;
import com.seleniumPractice.pages.HoversPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTest extends BaseTest{
    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHovers();
        HoversPage.FigureCaption caption= hoversPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"Caption not displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption title wrong");
        assertEquals(caption.getLinkText(),"View profile","Caption link text wrong");
        assertTrue(caption.getLink().endsWith("/users/1"),"Link incorrect");
    }
}
