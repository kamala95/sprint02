package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.io.FileWriter;
import java.io.IOException;

@Data
public class Account {
    public Account() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-testid='menu-item-notifications']")
    private WebElement notificationSettings;

    @FindBy(xpath = "//a[@data-testid='menu-item-manageYourPlan']")
    private WebElement manageYourPlan;

    @FindBy(xpath = "//a[@data-testid='menu-item-editProfile']")
    private WebElement editProfile;

    @FindBy(xpath = "//a[@data-testid='menu-item-recoverPlaylists']")
    private WebElement recoverPlaylists;

    @FindBy(xpath = "//a[@data-testid='menu-item-address']")
    private WebElement address;

    @FindBy(xpath = "//a[@data-testid='menu-item-orderHistory']")
    private WebElement orderHistory;

    @FindBy(xpath = "//a[@data-testid='menu-item-savedPaymentCards']")
    private WebElement savedPaymentCards;

    @FindBy(xpath = "//a[@data-testid='menu-item-redeem']")
    private WebElement redeem;

    @FindBy(xpath = "//a[@data-testid='menu-item-changePassword']")
    private WebElement changePassword;

    @FindBy(xpath = "//a[@data-testid='menu-item-apps']")
    private WebElement apps;

    @FindBy(xpath = "//a[@data-testid='menu-item-privacy']")
    private WebElement privacy;

    @FindBy(xpath = "//a[@data-testid='menu-item-loginMethods']")
    private WebElement loginMethods;

    @FindBy(xpath = "//a[@data-testid='menu-item-signOutEverywhere']")
    private WebElement signOutEverywhere;

    @FindBy(xpath = "//a[@data-testid='menu-item-supportSite']")
    private WebElement supportSite;

    @FindBy(xpath = "//a[@title='Instagram']")
    private WebElement instagram;

    public WebElement getInstagram() {
        return instagram;
    }

    @FindBy(xpath = "//h1")
    private WebElement igH1;

    public WebElement getIgH1() {
        return igH1;
    }

    @FindBy(xpath = "//a[@title='Twitter']")
    private WebElement twitter;

    public WebElement getTwitter() {
        return twitter;
    }

    @FindBy(xpath = "//div[@class='css-1rynq56 r-bcqeeo r-qvutc0 r-37j5jr r-a023e6 r-rjixqe r-16dba41' and @data-testid='UserDescription']/span")
    private WebElement twitterText;

    public WebElement getTwitterText() {
        return twitterText;
    }

    @FindBy(xpath = "//a[@title='Facebook']")
    private WebElement facebook;

    public WebElement getFacebook() {
        return facebook;
    }

    @FindBy(xpath = "(//span[@class='x193iq5w xeuugli x13faqbe x1vvkbs xlh3980 xvmahel x1n0sxbx x1lliihq x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x4zkp8e x3x7a5m x6prxxf xvq8zen xo1l8bm xzsf02u'])[2]")
    private WebElement facebookText;

    public WebElement getFacebookText() {
        return facebookText;
    }

    @FindBy(xpath = "//div[@aria-label='Close' and contains(@class, 'x1i10hfl')]/i[@data-visualcompletion='css-img']")
    private WebElement xBtnFb;

    public WebElement getxBtnFb() {
        return xBtnFb;
    }

    @FindBy(xpath = "//a[@data-ga-action='about']")
    private WebElement aboutPage;

    public WebElement getAboutPage() {
        return aboutPage;
    }

    @FindBy(xpath = "//a[@data-ga-action='help']")
    private WebElement supportPage;

    public WebElement getSupportPage() {
        return supportPage;
    }

    @FindBy(xpath = "//input[@id='search-input']")
    private WebElement searchField;

    public WebElement getSearchField() {
        return searchField;
    }

    @FindBy(xpath = "(//span[@data-encore-id='type'])[2]")
    private WebElement searchResult;

    public WebElement getSearchResult() {
        return searchResult;
    }

    @FindBy(xpath = "//section[@class='PageContent__Container-sc-1cswrfq-1 gtNpkI']")
    private WebElement aboutPageContent;

    public WebElement getAboutPageContent() {
        return aboutPageContent;
    }

    public void savePageContentToFile(String filePath) {
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(getAboutPageContent().getText());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FindBy(xpath = "//button[@class='mh-header-primary svelte-kdyqkb']")
    private WebElement profileBtn;

    public WebElement getProfileBtn() {
        return profileBtn;
    }

    @FindBy(xpath = "//a[@class='mh-subtle svelte-11h1c9']")
    private WebElement logOutBtn;

    public WebElement getLogOutBtn() {
        return logOutBtn;
    }

    public WebElement getNotificationSettings() {
        return notificationSettings;
    }

    public WebElement getManageYourPlan() {
        return manageYourPlan;
    }

    public WebElement getEditProfile() {
        return editProfile;
    }

    public WebElement getRecoverPlaylists() {
        return recoverPlaylists;
    }

    public WebElement getAddress() {
        return address;
    }

    public WebElement getOrderHistory() {
        return orderHistory;
    }

    public WebElement getSavedPaymentCards() {
        return savedPaymentCards;
    }

    public WebElement getRedeem() {
        return redeem;
    }

    public WebElement getChangePassword() {
        return changePassword;
    }

    public WebElement getApps() {
        return apps;
    }

    public WebElement getPrivacy() {
        return privacy;
    }

    public WebElement getLoginMethods() {
        return loginMethods;
    }

    public WebElement getSignOutEverywhere() {
        return signOutEverywhere;
    }

    public WebElement getSupportSite() {
        return supportSite;
    }
}


