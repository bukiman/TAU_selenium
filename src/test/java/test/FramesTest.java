package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.FramesPage;
import page.NestedFramesPage;

public class FramesTest extends BaseTest {

    @Test
    public void testFramesText() {

        FramesPage framesPage = homePage.clickFrames();
        NestedFramesPage nestedFramesPage = framesPage.clickNestedFrames();
        String text = nestedFramesPage.getLeftFrameText();
        Assert.assertEquals(text, "LEFT", "Incorrect frame");
        text = nestedFramesPage.getBottomFrameText();
        Assert.assertEquals(text, "BOTTOM", "Incorrect frame");
    }
}
