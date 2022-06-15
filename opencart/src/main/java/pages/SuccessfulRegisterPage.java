package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SuccessfulRegisterPage extends BasePage {

    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successfulRegistrationMessage;

    @FindBy(xpath = ".//*[@class= 'btn btn-primary']")
    private WebElement successfulRegistrationContinueButton;
}
