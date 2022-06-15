package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.TaxClassContainer;
import pages.containers.TaxRateContainer;

import java.util.List;
import java.util.stream.Collectors;


@Getter
public class AdminTaxClassesPage extends BasePage{

    @FindBy(xpath = "//div[@class = 'pull-right']/a")
    private WebElement addTaxClassButton;

    @FindBy(xpath = "//div[@class = 'pull-right']/button")
    private WebElement deleteTaxClassButton;

    @FindBy(xpath = "//thead/tr/td[1]")
    private WebElement summaryTaxClassesCheckbox;

    @FindBy(xpath = "//thead/tr/td[2]")
    private WebElement sortTaxClassByTitleButton;

    @FindBy(xpath = ".//tbody/tr")
    private List<WebElement> taxClasses;

    public List<TaxClassContainer> getTaxes() {
        return taxClasses.stream().map(TaxClassContainer::new).collect(Collectors.toList());
    }
}
