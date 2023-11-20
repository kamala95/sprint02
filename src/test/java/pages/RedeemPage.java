package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data

public class RedeemPage {
    public RedeemPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[@data-testid='menu-item-redeem']")
    private WebElement redeem;

    public WebElement getRedeem(){
        return redeem;
    }

}


