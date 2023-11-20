package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import pages.SearchPage;
import utils.SeleniumUtils;

import static org.testng.AssertJUnit.assertTrue;

public class SupportSearchTest extends TestBase{
    @Test(dataProvider = "dataFromCsv", groups = "smoke")
    public void helpSearchTermsFromFile(String help) throws InterruptedException {
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();
        SeleniumUtils.switchToWindow("Spotify");
        Account account = new Account();
        SeleniumUtils.scroll(0, 600);
        account.getSupportPage().click();
        account.getSearchField().sendKeys(help, Keys.ENTER);
        Thread.sleep(1000);
        String actualResult = account.getSearchResult().getText();
        assertTrue(actualResult.contains(help));

        Thread.sleep(1000);
    }

    @DataProvider
    public Object[][] dataFromCsv(){
        return SearchPage.readData("dataHelp.csv");
    }
}
