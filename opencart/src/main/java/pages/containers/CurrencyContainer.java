package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CurrencyContainer extends BasePage {

    private WebElement rootElement;

    public CurrencyContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getCurrencyCheckbox() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }

    public WebElement getCurrencyTitleText() {
        return rootElement.findElement(By.xpath(".//td[2]"));
    }

    public WebElement getCurrencyCodeText() {
        return rootElement.findElement(By.xpath(".//td[3]"));
    }

    public WebElement getCurrencyValueText() {
        return rootElement.findElement(By.xpath(".//td[4]"));
    }

    public WebElement getCurrencyDateLastUpdatedText() {
        return rootElement.findElement(By.xpath(".//td[5]"));
    }

    public WebElement getEditCurrencyButton() {
        return rootElement.findElement(By.xpath(".//td[6]/a"));
    }
}
