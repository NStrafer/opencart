package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class AdminAddTaxRatePage extends BasePage{

    @FindBy(id = "input-name")
    private WebElement taxNameInput;

    @FindBy(id = "input-rate")
    private WebElement taxRateInput;

    @FindBy(id = "input-type")
    private WebElement taxTypeSelect;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement customerGroupCheckbox;

    @FindBy(id = "input-geo-zone")
    private WebElement geoZoneSelect;

    @FindBy(xpath = "//div[@class='pull-right']/button")
    private WebElement saveTaxRateButton;
}
