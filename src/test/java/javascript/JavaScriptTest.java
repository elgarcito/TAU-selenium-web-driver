package javascript;

import base.BaseTest;
import org.testng.annotations.Test;

public class JavaScriptTest extends BaseTest {
    @Test
    public void testScrollToTable(){
        homePage.clickLargeAndDeepDomPage().scrollToTable();
    }

    @Test
    public void testScrolltoFifhtParagraph(){
        homePage.clickInfiniteScrollPage().scrollToParagraph(5);
    }

}
