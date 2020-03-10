package test;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.AlertsPage;

public class AlertsTest extends BaseTest {

    @Test
    public void testAcceptAlert() {

        AlertsPage alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerAlert();
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResult(),
                "You successfuly clicked an alert",
                "Result text incorrect");
    }

    @Test
    public void testGetTextFromAlert() {

        AlertsPage alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerConfirm();
        String text = alertsPage.alert_getText();
        alertsPage.alert_clickToDismiss();
        Assert.assertEquals(text, "I am a JS Confirm",
                "Alert text incorrect");
    }

    @Test
    public void testSetInputInAlert() {

        AlertsPage alertsPage = homePage.clickJSAlerts();
        alertsPage.triggerPrompt();

        String text = "TAU rocks";
        alertsPage.alert_setInput(text);
        alertsPage.alert_clickToAccept();
        Assert.assertEquals(alertsPage.getResult(), "You entered: " + text,
                "Result text incorrect");
    }
}
