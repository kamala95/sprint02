package tests;

import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import pages.ProfilePage;
import utils.Driver;

import java.time.Duration;

public class ClickAccount extends TestBase {

    @Test
    public void ProfileAndAccount() { // bu test run qiladigan joy

      new LoginTests().positiveLogin();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        LoginPage loginPage = new LoginPage();
        loginPage.validProfileIcon().click();

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        loginPage.getAccountPageBtn().click();


    }
}
