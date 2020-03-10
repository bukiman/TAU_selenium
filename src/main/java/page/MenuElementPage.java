package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuElementPage {

    private WebDriver driver;
    private By menuElements = By.tagName("li");

    public MenuElementPage(WebDriver driver) {
        this.driver = driver;
    }

    public void printMenuSize() {
        System.out.println(driver.findElements(menuElements).size());
    }
}
