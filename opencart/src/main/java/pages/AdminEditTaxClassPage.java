package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.AdminEditTaxClassContainer;
import pages.containers.CurrencyContainer;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class AdminEditTaxClassPage extends BasePage{

    @FindBy(xpath = "//button[@onclick='addRule();']")
    private WebElement addRuleButton;

    @FindBy(xpath = "//button[contains(@onclick,'remove')]")
    private List<WebElement> removeRuleButton;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> rates;

    @FindBy(xpath = "//div[@class='pull-right']/button")
    private WebElement saveButton;

    public List<AdminEditTaxClassContainer> getRates() {
        return rates.stream().map(AdminEditTaxClassContainer::new).collect(Collectors.toList());
    }
}
