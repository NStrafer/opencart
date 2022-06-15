package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class EditAccountPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement editFirstNameInput;

    @FindBy(id = "input-lastname")
    private WebElement editLastNameInput;

    @FindBy(id = "input-email")
    private WebElement editEmailInput;

    @FindBy(id = "input-telephone")
    private WebElement editTelephoneInput;

    @FindBy(xpath = ".//*[@class = 'btn btn-default']")
    private WebElement editBackButton;

    @FindBy(xpath = ".//*[@type = 'submit']")
    private WebElement editContinueButton;
}
