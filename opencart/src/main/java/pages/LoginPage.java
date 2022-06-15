package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends BasePage {

    @FindBy(xpath = ".//*[@id= 'input-email']")
    private WebElement inputLoginEmail;

    @FindBy(xpath = ".//*[@id= 'input-password']")
    private WebElement inputLoginPassword;

    @FindBy(xpath = ".//*[@type= 'submit']")
    private WebElement continueLoginButton;
}
