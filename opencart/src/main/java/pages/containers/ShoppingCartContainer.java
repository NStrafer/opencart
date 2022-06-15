package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ShoppingCartContainer extends BasePage {
    private WebElement rootElement;

    public ShoppingCartContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }
    public WebElement getProductImage() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }
    public WebElement getProductName() {
        return rootElement.findElement(By.xpath(".//td[2]"));
    }
    public WebElement getProductModel() {
        return rootElement.findElement(By.xpath(".//td[3]"));
    }
    public WebElement getProductQuantityInput() {
        return rootElement.findElement(By.xpath(".//td[4]//input"));
    }
    public WebElement getProductQuantityRefreshButton() {
        return rootElement.findElement(By.xpath(".//td[4]//button[1]"));
    }
    public WebElement getProductQuantityRemoveButton() {
        return rootElement.findElement(By.xpath(".//td[4]//button[2]"));
    }
    public WebElement getUnitPrice() {
        return rootElement.findElement(By.xpath(".//td[5]"));
    }
    public WebElement getTotalPrice() {
        return rootElement.findElement(By.xpath(".//td[6]"));
    }
}
