package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

@Data
public class AddressInfoPage {

    public AddressInfoPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-testid='menu-item-address']")
    private WebElement address;

    @FindBy(id = "address-street")
    private WebElement street;

    @FindBy(id = "address-city")
    private WebElement city;

    @FindBy(id = "address-state")
    private WebElement state;

    @FindBy(xpath = "//button[@data-testid=\"address-collection-edit-button\"]")
    private WebElement editAddressBt;

    @FindBy(id = "address-postal_code_short")
    private WebElement zipCode;

    @FindBy(xpath = "//span[@class=\"ButtonInner-sc-14ud5tc-0 hxGpNK encore-bright-accent-set\"]")
    private WebElement saveButton;


}
