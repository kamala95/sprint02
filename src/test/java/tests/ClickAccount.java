package tests;

import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Driver;

import java.time.Duration;

public class ClickAccount extends TestBase {

    @Test
    public void ProfileAndAccount() {//
      new LoginTests().positiveLogin();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage loginPage = new LoginPage();
        loginPage.validProfileIcon().click();

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.getAccountPageBtn().click();


    }
}
