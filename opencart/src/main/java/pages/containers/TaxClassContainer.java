package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TaxClassContainer extends BasePage {

    private WebElement rootElement;

    public TaxClassContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getTaxClassCheckbox() {
        return rootElement.findElement(By.xpath(".//tbody"));
    }

    public WebElement getTaxClassTitle() {
        return rootElement.findElement(By.xpath(".//td[2]"));
    }

    public WebElement getTaxClassEditButton() {
        return rootElement.findElement(By.xpath(".//td[3]/a"));
    }
}
