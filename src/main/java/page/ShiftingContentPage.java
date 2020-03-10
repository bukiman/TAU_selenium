package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShiftingContentPage {

    private WebDriver driver;
    private By menuLink = By.partialLinkText("Menu Element");

    public ShiftingContentPage(WebDriver driver) {
        this.driver = driver;
    }

    public MenuElementPage clickMenuElement() {
        driver.findElement(menuLink).click();
        return new MenuElementPage(driver);
    }
}
