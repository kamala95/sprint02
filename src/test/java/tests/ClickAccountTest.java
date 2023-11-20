package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Driver;

import java.time.Duration;

public class ClickAccountTest extends TestBase {

    @Test (groups = "smoke")
    public void ClickAccount() {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.getAccountPageBtn().click();

    }
}
