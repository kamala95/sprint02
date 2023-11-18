package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import pages.NotificationSettingsPage;
import utils.SeleniumUtils;

public class NotificationSettingsTests extends TestBase{
    @Test(groups = "smoke")
    public void notificationCheckboxTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();
        NotificationSettingsPage notificationSettingsPage = new NotificationSettingsPage();
        SeleniumUtils.switchToWindow("Spotify");
        Account account = new Account();
        account.getNotificationSettings().click();
        notificationSettingsPage.uncheckCheckbox("Music & Artist Recommendations", "push");
        notificationSettingsPage.uncheckCheckbox("Podcast & Show Recommendations", "email");
        notificationSettingsPage.uncheckCheckbox("In-person Concerts & Events", "push");
        notificationSettingsPage.uncheckCheckbox("Livestreams & Virtual Events", "email");
        notificationSettingsPage.uncheckCheckbox("Spotify Offers & Bundles", "push");
        notificationSettingsPage.uncheckCheckbox("News & Cultural Moments", "email");
        notificationSettingsPage.uncheckCheckbox("Surveys", "push");
        SeleniumUtils.scroll(0, 600);
        notificationSettingsPage.getSaveButton().click();
        SeleniumUtils.scroll(600, 0);
        Assert.assertEquals(notificationSettingsPage.getSavedAlert().getText(), "Notifications saved");

       // account.getProfileBtn().click();
        //account.getLogOutBtn().click();

    }
}
