package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Account;
import pages.EditProfilePage;
import pages.LoginPage;
import utils.Driver;
import utils.SeleniumUtils;

public class EditProfileTest extends TestBase {


    @Test
    public void editProfile(){


        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        Assert.assertTrue(loginPage.validProfileIcon().isDisplayed());

        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();

        SeleniumUtils.switchToWindow("Spotify");

        EditProfilePage editProfilePage = new EditProfilePage();
        editProfilePage.getEditProfileButton().click();
        Assert.assertEquals(Driver.getDriver().getTitle(), "Edit profile - Spotify");

//
//        editProfilePage.getCheckbox().click();
//        editProfilePage.getSaveButton().click();

    }
}
