package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class ProductContainer extends BasePage {
    private WebElement element;

    public ProductContainer(WebElement element) {
        this.element = element;
    }

    public WebElement getProductTitle() {
        return element.findElement(By.xpath(".//h4/a"));
    }

    public WebElement getAddToCartButton() {
        return element.findElement(By.xpath(".//*[@class= 'button-group']/button[1]"));
    }

    public WebElement getAddToWishListButton() {
        return element.findElement(By.xpath(".//*[@class= 'button-group']/button[2]"));
    }

    public WebElement getAddToCompareButton() {
        return element.findElement(By.xpath(".//*[@class= 'button-group']/button[3]"));
    }
}
