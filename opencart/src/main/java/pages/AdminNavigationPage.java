package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
@Getter
public class AdminNavigationPage extends BasePage {
    @FindBy(xpath = "//a[@href='#collapse7']")
    private WebElement settingsDropButton;

    @FindBy(xpath = "//a[@href='#collapse7-2']")
    private WebElement localizationDropButton;

    @FindBy(xpath = "//a[text()='Currencies'][1]")
    private WebElement currenciesButton;

    @FindBy(xpath = "//a[text()='Taxes']")
    private WebElement taxesDropButton;

    @FindBy(xpath = "//a[text()='Tax Rates'][1]")
    private WebElement taxRatesButton;

    @FindBy(xpath = "//a[text()='Tax Classes']")
    private WebElement taxClassesButton;

    @FindBy(xpath = "//a[text()='Products']")
    private WebElement productsButton;

    @FindBy(id = "menu-catalog")
    private WebElement catalogDropButton;
}
