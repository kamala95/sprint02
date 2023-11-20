package pages;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.util.List;

@Data
public class PaymentPage {
    public PaymentPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='sc-40d9701e-1 gtDAwj encore-base-set']")
    private List<WebElement> noReceiptsFound;

    public void noReceiptsFound(String addCard, String push) {
    }
}
