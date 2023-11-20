package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.ConfigReader;
import utils.Driver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static utils.SeleniumUtils.jsClick;

public class SearchPage {

    public SearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath= "//a[@aria-label='Search']")
    private WebElement searchButton;
    public WebElement getSearchButton() {
        return searchButton;
    }


    @FindBy(xpath= "//input[@placeholder=\"What do you want to listen to?\"]")
    private WebElement searchLine;

    public WebElement getSearchLine() {
        return searchLine;
    }

    public void performSearch(){
        searchLine.sendKeys(ConfigReader.getProperty("artistname"));
    }

    public void searchButtonClick(){
        jsClick(searchButton);
    }

    @FindBy(xpath= "//div[@class='PFgcCoJSWC3KjhZxHDYH']")
    private WebElement playButton;

    public WebElement getPlayButton() {
        return searchLine;
    }

    public void playButtonClick(){
        jsClick(playButton);
    }

    @FindBy(xpath = "//div[@class= '_gB1lxCfXeR8_Wze5Cx9']")
    private WebElement targetElement;
    public WebElement getTargetElement() {
        return targetElement;
    }

    public void performActions() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(targetElement).clickAndHold().perform();
        jsClick(playButton);
    }
    @FindBy(xpath= "//div[@class='Type__TypeElement-sc-goli3j-0 gIkgYW nk6UgB4GUYNoAcPtAQaG'][1]")
    private WebElement recentlyPlayed;

    public WebElement getRecentlyPlayed() {
        return recentlyPlayed;
    }
    @FindBy(xpath= "//a[@aria-label='Home']")
    private WebElement homeButton;

    public WebElement getHomeButton() {
        return homeButton;
    }

    public void homeButtonClick(){
        jsClick(homeButton);}


    @FindBy(xpath="//div[@data-testid='herocard-click-handler']")
    private WebElement topResult;

    public WebElement getTopResult() {
        return topResult;
    }

    @FindBy(xpath="//div[@class='Type__TypeElement-sc-goli3j-0 eoWRdH']")
    private WebElement seeMoreButton;

    public WebElement getSeeMoreButton(){return seeMoreButton;}

    @FindBy(xpath="//a[@ data-testid='context-item-info-artist']")
    private WebElement artistName;

    public WebElement getArtistName() {
        return artistName;
    }


    @FindBy(xpath= "//div[@class='VpYFchIiPg3tPhBGyynT']")
    private List<WebElement> songsFromSongsSection;

    public  List<WebElement> getSongsFromSongSection() {
        return songsFromSongsSection;
    }

    public static Object[][] readData(String filePath)  {
        List<String[]> list = null;
        try{
            BufferedReader br =  new BufferedReader(new FileReader(filePath));;
            String line;
            list = new ArrayList<>();
            while((line=br.readLine()) != null){
                String[] row = line.split(",");
                list.add(row);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        Object [][] data =  new Object[list.size()][list.get(0).length];

        for (int i = 0; i < list.size(); i++) {
            data[i] = list.get(i);
        }
        return data;
    }

    @FindBy(xpath="//div[@class='Type__TypeElement-sc-goli3j-0 kjfRyT nk6UgB4GUYNoAcPtAQaG']")
    private WebElement topResult2;

    public WebElement getArtistName2() {
        return topResult2;
    }


}
