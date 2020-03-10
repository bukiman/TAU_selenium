package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.HorizontalSliderPage;

public class HorizontalSliderTest extends BaseTest {

    @Test
    public void testSlider() {

        HorizontalSliderPage sliderPage = homePage.clickHorizontalSlider();
        sliderPage.clickSlider();
        while(!sliderPage.getValue().equals("4")) {
            sliderPage.sendRightKey();
            System.out.println("sent");
        }
        Assert.assertEquals(sliderPage.getValue(), "4", "Incorrect position");
    }
}
