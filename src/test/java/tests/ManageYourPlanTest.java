package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManageYourPlanPage;
import utils.Driver;
import utils.SeleniumUtils;

@Test
public class ManageYourPlanTest extends TestBase{

public void manageUrPlan() {
    LoginPage loginPage = new LoginPage();
    loginPage.validLogin1().click();
    loginPage.validLogin();
    Assert.assertTrue(loginPage.validProfileIcon().isDisplayed());

    loginPage.validProfileIcon().click();
    loginPage.getAccountPageBtn().click();

    SeleniumUtils.switchToWindow("Spotify");
    ManageYourPlanPage manageYourPlanPage = new ManageYourPlanPage();
    manageYourPlanPage.getManageYourPlan().click();
    Assert.assertEquals(Driver.getDriver().getTitle(), "Manage your plan - Spotify");


}

}
