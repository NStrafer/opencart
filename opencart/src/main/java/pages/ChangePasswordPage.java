package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class ChangePasswordPage extends BasePage {

    @FindBy(id = "input-password")
    private WebElement changePasswordInput;

    @FindBy(id = "input-confirm")
    private WebElement changePasswordConfirmInput;

    @FindBy(xpath = ".//*[@type= 'submit']")
    private WebElement changePasswordContinueButton;

    @FindBy(xpath = ".//*[@class= 'btn btn-default']")
    private WebElement changePasswordBackButton;
}
