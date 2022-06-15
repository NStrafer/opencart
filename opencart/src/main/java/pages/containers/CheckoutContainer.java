package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CheckoutContainer extends BasePage {

    private WebElement rootElement;

    public CheckoutContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getProductName() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }

    public WebElement getModel() {
        return rootElement.findElement(By.xpath(".//td[2]"));
    }

    public WebElement getQuantity() {
        return rootElement.findElement(By.xpath(".//td[3]"));
    }

    public WebElement getUnitPrice() {
        return rootElement.findElement(By.xpath(".//td[4]"));
    }

    public WebElement getTotal() {
        return rootElement.findElement(By.xpath(".//td[5]"));
    }
}
