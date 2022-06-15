package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SuccessfulOrderPage extends BasePage {

    @FindBy(xpath = ".//*[@id='content']/h1")
    private WebElement successfulOrderMessage;

    @FindBy(xpath = ".//*[@class ='btn btn-primary']")
    private WebElement continueButton;
}
