package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class TaxRateContainer extends BasePage {

    private WebElement rootElement;

    public TaxRateContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getTaxCheckbox() {
        return rootElement.findElement(By.xpath(".//td[1]/input"));
    }

    public WebElement getTaxNameText() {
        return rootElement.findElement(By.xpath(".//td[2]"));
    }

    public WebElement getTaxRateText() {
        return rootElement.findElement(By.xpath(".//td[3]"));
    }

    public WebElement getTaxTypeText() {
        return rootElement.findElement(By.xpath(".//td[4]"));
    }

    public WebElement getGeoZoneText() {
        return rootElement.findElement(By.xpath(".//td[5]"));
    }

    public WebElement getDateAddedText() {
        return rootElement.findElement(By.xpath(".//td[6]"));
    }

    public WebElement getDateModified() {
        return rootElement.findElement(By.xpath(".//td[7]"));
    }

    public WebElement getEditButton() {
        return rootElement.findElement(By.xpath(".//td[8]/a"));
    }

}
