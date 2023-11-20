package tests;

import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import pages.SavedPaymentCards;
import utils.Driver;
import utils.SeleniumUtils;

public class SavedPaymentCardsTest extends TestBase{


    @Test(groups = "smoke")
    public void landSavedPaymentCards() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();

        SeleniumUtils.switchToWindow("Spotify");
        System.out.println(Driver.getDriver().getCurrentUrl());

        Thread.sleep(2000);
        Account account = new Account();
        account.getSavedPaymentCards().click();
        Thread.sleep(2000);
        SavedPaymentCards savedPaymentCards = new SavedPaymentCards();
        savedPaymentCards.uncheckMayCard("Add card", "push");
    }
}

