package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AdminLoginPage extends BasePage {

    @FindBy(id = "input-username")
    private WebElement userNameInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(xpath = " //a[text()='Forgotten Password']")
    private WebElement forgottenPasswordButton;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement loginButton;

}
