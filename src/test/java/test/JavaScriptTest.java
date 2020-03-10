package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DropdownPage;
import page.LargeAndDeepDomPage;

public class JavaScriptTest extends BaseTest {

    @Test
    public void testScrollToTable() {

        LargeAndDeepDomPage largePage = homePage.clickLargeAndDeepDom();
        largePage.scorllTable();
    }

    @Test
    public void testScrollToFifthParagraph() {

        homePage.clickInfiniteScroll().scrollToParagraph(5);
    }

    @Test
    public void testMultipleDropdown() {

        String optionOne = "Option 1";
        String optionTwo = "Option 2";

        DropdownPage dropdownPage = homePage.clickDropDown();
        dropdownPage.convertToMultipleDropdown();
        dropdownPage.selectFromDropdown(optionOne);
        dropdownPage.selectFromDropdown(optionTwo);
        Assert.assertEquals(dropdownPage.getSelectedOptions().toString(),
                "[" + optionOne + ", " + optionTwo + "]", "Incorrect list");
    }
}
