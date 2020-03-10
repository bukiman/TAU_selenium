package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EntryAdPage {

    private WebDriver driver;
    private By modalBody = By.className("modal-body");
    private By modalFooter = By.className("modal-footer");

    public EntryAdPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getModalText() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(modalBody)));
        return driver.findElement(modalBody).getText();
    }

    public void closeModal() {
        driver.findElement(modalFooter).click();
    }
}
