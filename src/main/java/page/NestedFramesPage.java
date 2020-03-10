package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

    private WebDriver driver;
    private By topFrame = By.name("frame-top");
    private By leftFrame = By.name("frame-left");
    private By bottomFrame = By.name("frame-bottom");
    private By leftFrameBody = By.tagName("body");
    private By bottomFrameBody = By.tagName("body");

    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }

    private void switchToFrame(By frameName) {
        driver.switchTo().frame(driver.findElement(frameName));
    }

    public String getBottomFrameText() {
        switchToFrame(bottomFrame);
        String text = driver.findElement(bottomFrameBody).getText();
        switchToParentFrame();
        return text;
    }

    public String getLeftFrameText() {
        switchToFrame(topFrame);
        switchToFrame(leftFrame);
        String text = driver.findElement(leftFrameBody).getText();
        switchToParentFrame();
        switchToParentFrame();
        return text;
    }

    private void switchToParentFrame() {
        driver.switchTo().parentFrame();
    }
}
