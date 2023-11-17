package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends TestBase{

    @Test(groups = "smoke")
    public void positiveLogin() {
        //do not change the login code

        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        Assert.assertTrue(loginPage.validProfileIcon().isDisplayed());


    }
}
