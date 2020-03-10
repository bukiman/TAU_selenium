package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DynamicLoadingPage {

    private WebDriver driver;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public ExampleOnePage clickExampleOne() {
        clickLink("Example 1").click();
        return new ExampleOnePage(driver);
    }

    public ExampleTwoPage clickExampleTwo() {
        clickLink("Example 2").click();
        return new ExampleTwoPage(driver);
    }

    public ExampleTwoPage openExample2InNewTab() {
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL).click(clickLink("Example 2"))
                .keyUp(Keys.CONTROL).perform();
        return new ExampleTwoPage(driver);
    }

    private WebElement clickLink(String linkText) {
        return driver.findElement(By.partialLinkText(linkText));
    }
}
