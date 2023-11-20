package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RedeemPage;
import utils.Driver;
import utils.SeleniumUtils;

public class RedeemTest extends TestBase {
    @Test(groups = "smoke")
    public void landRedeemPage() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();

        SeleniumUtils.switchToWindow("Spotify");
        System.out.println(Driver.getDriver().getCurrentUrl());

        Thread.sleep(2000);
        RedeemPage redeemPage = new RedeemPage();
        redeemPage.getRedeem().click();

        Assert.assertEquals(Driver.getDriver().getTitle(), "Redeem your code");
    }
}
