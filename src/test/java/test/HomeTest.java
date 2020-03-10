package test;

import base.BaseTest;
import org.testng.annotations.Test;
import page.MenuElementPage;
import page.ShiftingContentPage;

public class HomeTest extends BaseTest {

    @Test
    public void testInputsLink() {

        homePage.printTotalLinks();
        homePage.clickInputsLink();
    }

    @Test
    public void testMenuElementCount() {

        ShiftingContentPage shiftingPage = homePage.clickShifting();
        MenuElementPage menuPage = shiftingPage.clickMenuElement();
        menuPage.printMenuSize();
    }
}
