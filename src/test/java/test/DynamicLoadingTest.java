package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DynamicLoadingPage;
import page.ExampleOnePage;
import page.ExampleTwoPage;

public class DynamicLoadingTest extends BaseTest {

    @Test
    public void testWaitUntilHidden() {

        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
        ExampleOnePage exampleOnePage = loadingPage.clickExampleOne();
        exampleOnePage.clickStartButton();
        Assert.assertEquals(exampleOnePage.getLoadedText(), "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testWaitUntilRendered() {

        DynamicLoadingPage loadingPage = homePage.clickDynamicLoading();
        ExampleTwoPage exampleTwoPage = loadingPage.clickExampleTwo();
        exampleTwoPage.clickStartButton();
        String text = exampleTwoPage.getLoadedText();
        Assert.assertEquals(text, "Hello World!", "Loaded text incorrect");
    }

    @Test
    public void testOpenNewTab() {

        ExampleTwoPage ex2Page = homePage.clickDynamicLoading().openExample2InNewTab();
        getWindowManager().switchToTab(1);
        Assert.assertEquals(ex2Page.getButtonText(), "Start", "Incorrect text");
    }
}
