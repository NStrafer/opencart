package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.CurrencyContainer;

import java.util.List;
import java.util.stream.Collectors;
@Getter
public class AdminCurrencyPage extends BasePage{

    @FindBy(xpath = "//div[@class='pull-right']/a[1]")
    private WebElement refreshCurrencyValuesButton;

    @FindBy(xpath = "//div[@class='pull-right']/a[2]")
    private WebElement addCurrencyValueButton;

    @FindBy(xpath = "//div[@class='pull-right']/button")
    private WebElement deleteCurrencyValueButton;

    @FindBy(xpath = "//thead//td[1]/input")
    private WebElement summaryCurrencyCheckbox;

    @FindBy(xpath = "//thead//td[2]/a")
    private WebElement sortByCurrencyTitleButton;

    @FindBy(xpath = "//thead//td[3]/a")
    private WebElement sortByCodeButton;

    @FindBy(xpath = "//thead//td[4]/a")
    private WebElement sortByValueButton;

    @FindBy(xpath = "//thead//td[5]/a")
    private WebElement sortByLastUpdatedButton;

    @FindBy(xpath = "//tbody/tr")
    private List<WebElement> currencies;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement succesfulModifiedCurrency;


    public List<CurrencyContainer> getCurrencies() {
        return currencies.stream().map(CurrencyContainer::new).collect(Collectors.toList());
    }

}
