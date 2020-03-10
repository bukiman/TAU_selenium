package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {

    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By value = By.id("range");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSlider() {
        driver.findElement(slider).click();
    }

    public void sendRightKey() {
        driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
    }

    public String getValue() {
        return driver.findElement(value).getText();
    }
}
