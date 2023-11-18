package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Data
public class EditProfilePage {

    public EditProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-testid=\"menu-item-editProfile\"]" )
    private WebElement editProfileButton;


    @FindBy(id = "third_party_email")
    private WebElement checkbox;

    @FindBy(xpath = "(//button[@class=\"Button-sc-qlcn5g-0 dRlmYr\"])[2]")
    private WebElement saveButton;



}
