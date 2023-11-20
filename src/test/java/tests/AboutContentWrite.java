package tests;

import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import utils.SeleniumUtils;

public class AboutContentWrite extends TestBase{

    @Test(groups = "smoke")
    public void savePageContentToFile(){
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();
        SeleniumUtils.switchToWindow("Spotify");
        Account account = new Account();
        SeleniumUtils.scroll(0, 600);
        account.getAboutPage().click();
        account.savePageContentToFile("aboutContent.txt");

    }

    }
