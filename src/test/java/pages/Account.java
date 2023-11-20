package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

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
