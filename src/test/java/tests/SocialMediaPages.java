package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import utils.SeleniumUtils;

public class SocialMediaPages extends TestBase{
    @Test(groups = "smoke")
    public void navigateInstagram() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();
        SeleniumUtils.switchToWindow("Spotify");
        Account account = new Account();
        SeleniumUtils.scroll(0, 600);
        account.getInstagram().click();
        Thread.sleep(1000);
        SeleniumUtils.switchToWindow("Spotify (@spotify) • Instagram photos and videos");
        Assert.assertEquals(account.getIgH1().getText(), "Music, podcasts, and audiobooks for every moment.");
    }

    @Test(groups = "smoke")
    public void navigateTwitter() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();
        SeleniumUtils.switchToWindow("Spotify");
        Account account = new Account();
        SeleniumUtils.scroll(0, 600);
        account.getTwitter().click();
        Thread.sleep(5000);
        SeleniumUtils.switchToWindow("Spotify (@Spotify) / X");
        Thread.sleep(3000);
        Assert.assertEquals(account.getTwitterText().getText(), "Music, podcasts, and audiobooks for every moment.");
    }

    @Test(groups = "smoke")
    public void navigateaFacebook() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        Thread.sleep(1000);
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();
        SeleniumUtils.switchToWindow("Spotify");
        Account account = new Account();
        SeleniumUtils.scroll(0, 600);
        account.getFacebook().click();
        Thread.sleep(1000);
        SeleniumUtils.switchToWindow("Spotify | Facebook");
        Thread.sleep(1000);
        account.getxBtnFb().click();
        Thread.sleep(3000);
        Assert.assertEquals(account.getFacebookText().getText(), "Music for every moment. Play, discover and share for free.");
    }
}
