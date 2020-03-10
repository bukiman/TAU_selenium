package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;
import page.SecureAreaPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {

        LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
/*        Assert.assertEquals(secureAreaPage.getAlertText().split("\n")[0],
                "You logged into a secure area!",
                "Alert text is incorrect");*/
        Assert.assertTrue(secureAreaPage.getAlertText()
                        .contains("You logged into a secure area!"),
                "Alert text is incorrect");
    }
}
