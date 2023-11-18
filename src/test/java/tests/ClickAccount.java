package tests;

import pages.LoginPage;
import pages.ProfilePage;
import utils.Driver;

import java.time.Duration;

public class ProfileAndAccount {

    public void ProfileAndAccount() {

      new LoginTests().positiveLogin();
        ProfilePage profilePage = new ProfilePage();
        ProfilePage
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        profilePage.getAccountLink().click();
    }
}
