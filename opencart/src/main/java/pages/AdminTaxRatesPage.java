package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.CheckoutContainer;
import pages.containers.TaxRateContainer;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class AdminTaxRatesPage extends BasePage {

    @FindBy(xpath = "//div[@class = 'pull-right']/a")
    private WebElement addNewButton;

    @FindBy(xpath = "//div[@class = 'pull-right']/button")
    private WebElement deleteButton;

    @FindBy(xpath = "//thead//input")
    private WebElement summaryCheckBoxInput;

    @FindBy(xpath = "//thead//td[2]/a")
    private WebElement taxNameSortButton;

    @FindBy(xpath = "//thead//td[3]/a")
    private WebElement taxRateSortButton;

    @FindBy(xpath = "//thead//td[4]/a")
    private WebElement typeSortButton;

    @FindBy(xpath = "//thead//td[5]/a")
    private WebElement geoZoneSortButton;

    @FindBy(xpath = "//thead//td[6]/a")
    private WebElement dateAddedSortButton;

    @FindBy(xpath = "//thead//td[7]/a")
    private WebElement dateModifiedSortButton;

    @FindBy(xpath = "//thead//td[7]/a")
    private WebElement taxCheckbox;
    @FindBy(xpath = ".//tbody/tr")
    private List<WebElement> taxesTbody;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement successfulAddTaxRateMessage;

    public List<TaxRateContainer> getTaxes() {
        return taxesTbody.stream().map(TaxRateContainer::new).collect(Collectors.toList());
    }

}
