package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;
@Data
public class ProfilePage {

    public ProfilePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@data-testid=\"placeholder-wrapper\"]")
    private WebElement profile;


    //    @FindBy(xpath = "data-encore-id=\"type\"")


}
