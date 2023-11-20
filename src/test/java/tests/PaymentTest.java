package tests;

import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import pages.PaymentPage;
import utils.Driver;
import utils.SeleniumUtils;

public class PaymentTest extends TestBase{
    @Test(groups = "smoke")
    public void validPayment() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();

        SeleniumUtils.switchToWindow("Spotify");
        System.out.println(Driver.getDriver().getCurrentUrl());

        Thread.sleep(2000);
        Account account = new Account();
        account.getOrderHistory().click();
        Thread.sleep(2000);
        PaymentPage payment = new PaymentPage();
        payment.noReceiptsFound("No receipts found", "push");
    }
}
