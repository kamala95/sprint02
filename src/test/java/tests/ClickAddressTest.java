package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import utils.Driver;

import java.time.Duration;
import java.util.Set;

public class ClickAddressTest extends TestBase {

    @Test (groups = "smoke")
    public void openAddressWindow(){
        LoginPage loginPage = new LoginPage();
        loginPage.validLogin1().click();
        loginPage.validLogin();
        loginPage.validProfileIcon().click();
        loginPage.getAccountPageBtn().click();

        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        String parentHandle = Driver.getDriver().getWindowHandle();
        Set<String> handles = Driver.getDriver().getWindowHandles();

        for (String handle : handles) {
//            System.out.println(handle);
            if(!handle.equals(parentHandle)){
                Driver.getDriver().switchTo().window(handle);
            }
            Driver.getDriver().switchTo().window(handle);
        }
                Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
                Account account = new Account();
                account.getAddress().click();
                Assert.assertEquals(Driver.getDriver().getTitle(), "Your address - Spotify");
            }

        }




