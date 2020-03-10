package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.EmailSentPage;
import page.ForgotPasswordPage;

public class EmailConfirmationMessageTest extends BaseTest {

    @Test
    public void testEmailConfirmationMessage() {

        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        EmailSentPage emailSentPage = forgotPasswordPage.clickRetrieveButton();
        Assert.assertEquals(emailSentPage.getConfirmationMessage(),
                "Your e-mail's been sent!",
                "Email not sent");
    }
}
