package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AdminEditCurrencyPage extends BasePage {

    @FindBy(xpath = "//*[@id='input-title']")
    private WebElement currencyTitleInput;

    @FindBy(id = "input-code")
    private WebElement codeInput;

    @FindBy(xpath = " //div[@class='form-group required']//span")
    private WebElement codeSpanAdditionalInfo;

    @FindBy(id = "input-symbol-left")
    private WebElement symbolLeftInput;

    @FindBy(id = "input-symbol-right")
    private WebElement symbolRightInput;

    @FindBy(id = "input-decimal-place")
    private WebElement decimalPlacesInput;

    @FindBy(id = "input-value")
    private WebElement valueInput;

    @FindBy(xpath = "//div[@class='form-group']//span")
    private WebElement valueSpanAdditionalInfo;

    @FindBy(xpath = "//select")
    private WebElement statusSelect;

    @FindBy(id = "input-status")
    private WebElement statusSelectButton;

    @FindBy(xpath = "//div[@class='pull-right']/button")
    private WebElement saveEditCurrencyButton;

    @FindBy(xpath = "//div[@class='pull-right']/a")
    private WebElement cancelEditCurrencyButton;

}
