package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.Account;
import pages.AddressInfoPage;
import pages.LoginPage;
import utils.Driver;
import utils.SeleniumUtils;

public class AddressInfoFillTest extends TestBase {

    Faker faker = new Faker();

    @Test (groups = "regression")
    public void addressFillOut() throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();

        SeleniumUtils.switchToWindow("Spotify");
        System.out.println(Driver.getDriver().getCurrentUrl());

        Thread.sleep(2000);
        Account account = new Account();
        account.getAddress().click();

        SeleniumUtils.switchToWindow("Your address - Spotify");
        AddressInfoPage addressInfoPage = new AddressInfoPage();
        System.out.println(Driver.getDriver().getCurrentUrl());

        addressInfoPage.getEditAddressBt().click();
        Thread.sleep(2000);
        addressInfoPage.getStreet().sendKeys(Keys.COMMAND + "a", Keys.DELETE,
                "11851 Monument Dr");
        addressInfoPage.getCity().sendKeys(
                Keys.COMMAND + "a", Keys.DELETE,
                "Fairfax") ;
//        addressInfoPage.getState().click();

        Select select = new Select(addressInfoPage.getState());
        select.selectByVisibleText("Virginia");
        addressInfoPage.getState().click();

        addressInfoPage.getZipCode().sendKeys(Keys.COMMAND + "a", "22030", Keys.ENTER);
        Thread.sleep(2000);

        addressInfoPage.getSaveButton().click();



    }
}
