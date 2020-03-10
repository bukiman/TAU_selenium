package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.ContextMenuPage;

public class RightClickTest extends BaseTest {

    @Test
    public void testRightClick() {

        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClick();
        String text = contextMenuPage.getAlertText();
        contextMenuPage.alertAccept();
        Assert.assertEquals(text, "You selected a context menu",
                "Incorrect action");
    }
}
