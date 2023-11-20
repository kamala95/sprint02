package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

public class SavedPaymentCards {
    public SavedPaymentCards() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//div[@class='sc-Nxspf iBQLyM']")
    private List<WebElement> myCard;

    public void uncheckMayCard(String s, String push) {
    }



}
