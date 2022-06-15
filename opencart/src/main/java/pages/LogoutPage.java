package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LogoutPage extends BasePage {

    @FindBy(xpath= ".//*[@id= 'content']/h1")
    private WebElement successfulLogoutMessage;

    @FindBy(xpath= ".//*[@class = 'btn btn-primary']")
    private WebElement continueButton;
}
