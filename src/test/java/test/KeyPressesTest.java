package test;

import base.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.KeyPressesPage;

public class KeyPressesTest extends BaseTest {

    @Test
    public void testBackspace() {
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        Assert.assertEquals(keyPage.getResult(), "You entered: BACK_SPACE");
    }

    @Test
    public void testPi() {
        KeyPressesPage keyPage = homePage.clickKeyPresses();
        keyPage.enterPi();
    }
}
