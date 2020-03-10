package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.EntryAdPage;

public class ModalTest extends BaseTest {

    @Test
    public void testModalText() throws InterruptedException {

        EntryAdPage modalPage = homePage.clickEntryAd();
        String text = modalPage.getModalText();
        modalPage.closeModal();
        Assert.assertEquals(text, "It's commonly used to encourage a user to " +
                "take an action (e.g., give their e-mail address to sign up for something or disable their ad blocker).",
                "Incorrect modal text");
    }
}
