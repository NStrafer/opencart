package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class AdminHomePageLatestOrderContainer extends BasePage {

    private WebElement rootElement;

    public AdminHomePageLatestOrderContainer(WebElement rootElement) {
        this.rootElement = rootElement;
    }

    public WebElement getOrderIdText() {
        return rootElement.findElement(By.xpath(".//td[1]"));
    }
    public WebElement getCustomerText() {
        return rootElement.findElement(By.xpath(".//td[2]"));
    }
    public WebElement getStatusOrderText() {
        return rootElement.findElement(By.xpath(".//td[3]"));
    }
    public WebElement getDateAddedText() {
        return rootElement.findElement(By.xpath(".//td[4]"));
    }
    public WebElement getOrderTotalPriceText() {
        return rootElement.findElement(By.xpath(".//td[5]"));
    }
    public WebElement getOrderViewButton() {
        return rootElement.findElement(By.xpath(".//td[6]/a"));
    }

}
