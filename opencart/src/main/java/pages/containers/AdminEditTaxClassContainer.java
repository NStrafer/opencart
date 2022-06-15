package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

import java.util.List;
import java.util.stream.Collectors;

public class AdminEditTaxClassContainer extends BasePage {
    private WebElement rootElement;

    public AdminEditTaxClassContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getTaxRateSelect() {
        return rootElement.findElement(By.xpath(".//td[1]/select"));
    }
    public WebElement getBasedOnSelect() {
        return rootElement.findElement(By.xpath(".//td[2]/select"));
    }
    public WebElement getPriority() {
        return rootElement.findElement(By.xpath(".//td[3]"));
    }

}
