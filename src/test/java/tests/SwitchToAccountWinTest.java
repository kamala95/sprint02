package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Account;
import pages.LoginPage;
import utils.Driver;

import java.time.Duration;
import java.util.Set;

public class SwitchToAccountWinTest extends TestBase {

    @BeforeMethod
   public void loginStep(){
       LoginPage loginPage = new LoginPage();
       loginPage.validLogin1().click();
       loginPage.validLogin();
       loginPage.validProfileIcon().click();
       loginPage.getAccountPageBtn().click();

   }
    @Test (groups = "smoke")
    public void switchToAccountWindow(){

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
        Assert.assertEquals(Driver.getDriver().getTitle(), "Spotify");

           System.out.println("Current URL: " + Driver.getDriver().getCurrentUrl());
        System.out.println(parentHandle);
       }
    }

