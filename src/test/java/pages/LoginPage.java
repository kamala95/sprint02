package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;


public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
        @FindBy(id= "login-username")
        private WebElement usernameField;

        public WebElement getUsernameField() {
            return usernameField;
        }

        public void validLogin(){
            usernameField.sendKeys("emilyjohnson202324@gmail.com", Keys.TAB,"DuotechAcademy2023", Keys.ENTER);
        }

        @FindBy(xpath = "//button[@data-testid='login-button']")
        private WebElement loginButton1;

        public WebElement validLogin1(){
            return loginButton1;
        }

        @FindBy(xpath = "//div[@data-testid='placeholder-wrapper']")
        private WebElement profileIcon;

        public WebElement validProfileIcon(){
            return profileIcon;
    }
}
