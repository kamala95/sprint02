package tests;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.SearchPage;
import utils.ConfigReader;
import java.util.List;

import static org.testng.AssertJUnit.assertTrue;

public class SearchTests extends TestBase {


    @Test(groups = "smoke")
    public void verifyTopResultArtistName() throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        new LoginTests().positiveLogin();
        searchPage.searchButtonClick();
        searchPage.performSearch();
        searchPage.getTopResult().click();
        Thread.sleep(1000);
        searchPage.getSeeMoreButton().click();

        List<WebElement> songs = searchPage.getSongsFromSongSection();
        for (WebElement song : songs) {
            song.click();
            Thread.sleep(1000);
            String actualArtist = searchPage.getArtistName().getText();
            assertTrue(actualArtist.equals(ConfigReader.getProperty("artistname")));
            song.click();
        }
    }


    @Test(dataProvider = "dataFromCsv", groups = "smoke")
    public void searchResultIncludesGivenValue(String firstName) throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        new LoginTests().positiveLogin();
        searchPage.searchButtonClick();
        searchPage.getSearchLine().sendKeys(firstName);
        String actualName = searchPage.getArtistName2().getText();
        Thread.sleep(1000);
        assertTrue(actualName.contains(firstName));
    }

    @Test (groups = "smoke")
    public void recentlyListenedSong()  {
        SearchPage searchPage = new SearchPage();
        new LoginTests().positiveLogin();
        searchPage.searchButtonClick();
        searchPage.performSearch();
        searchPage.performActions();
        searchPage.homeButtonClick();
        assertTrue(searchPage.getRecentlyPlayed().getText().equals(ConfigReader.getProperty("artistname")));
    }

    @DataProvider
    public Object[][] dataFromCsv(){
        return SearchPage.readData("data.csv");
    }
}






