package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.DropdownPage;

import java.util.List;

public class DropdownTest extends BaseTest {

    @Test
    public void testDropdown() throws InterruptedException {

        String option = "Option 1";
        DropdownPage dropdownPage = homePage.clickDropDown();
        dropdownPage.selectFromDropdown(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        Assert.assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
