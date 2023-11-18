package tests;

import org.testng.annotations.Test;
import utils.Driver;

import java.time.Duration;
import java.util.Collections;
import java.util.Set;
@Test
public class SwithToAccountPg extends TestBase {

    public void switchToAccountWindow(){

        new ClickAccount().ProfileAndAccount();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       Set<String> handles = Collections.singleton(Driver.getDriver().getWindowHandle());
       for(String handle: handles){
           Driver.getDriver().switchTo();
           if(Driver.getDriver().getTitle().equals("Spotify")) {
               break;
           }
       }
    }
}
