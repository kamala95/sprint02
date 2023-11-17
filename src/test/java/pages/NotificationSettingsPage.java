package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class NotificationSettingsPage {

    public NotificationSettingsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@class='Indicator-sc-1airx73-0 cuOkoK']")
    private List<WebElement> checkboxes;

    @FindBy(xpath = "(//button[@class='Button-sc-qlcn5g-0 dRlmYr'])[2]")
    private WebElement saveButton;

    public WebElement getSaveButton() {
        return saveButton;
    }

    @FindBy(xpath = "//div[@class='sc-40d9701e-1 gmctwR encore-positive-set']")
    private WebElement savedAlert;

    public WebElement getSavedAlert() {
        return savedAlert;
    }

    public void uncheckCheckbox(String notificationName, String type){
        switch (notificationName){
            case"Music & Artist Recommendations":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(1));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(2));
                }
                break;

            case"Podcast & Show Recommendations":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(3));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(4));
                }
                break;

            case"Audiobooks":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(5));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(6));
                }
                break;

            case"In-person Concerts & Events":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(7));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(8));
                }
                break;

            case"Livestreams & Virtual Events":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(9));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(10));
                }
                break;

            case"Spotify Features & Tips":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(11));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(12));
                }
                break;

            case"Spotify Offers & Bundles":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(13));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(14));
                }
                break;

            case"Spotify Experiences Made for You":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(15));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(16));
                }
                break;

            case"News & Cultural Moments":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(17));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(18));
                }
                break;

            case"Artist & Creator Merchandise":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(19));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(20));
                }
                break;

            case"Surveys":
                if (type.toLowerCase().equals("push")){
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(21));
                } else {
                    JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
                    executor.executeScript("arguments[0].click();", checkboxes.get(22));
                }
                break;
        }
    }

}
