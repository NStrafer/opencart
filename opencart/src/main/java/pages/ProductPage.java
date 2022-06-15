package pages;

import driver.Driver;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.ProductContainer;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Getter
public class ProductPage extends BasePage {

    @FindBy(xpath = ".//*[contains(@class, 'product-layout')]")
    private List<WebElement> products;

    @FindBy(xpath = ".//*[@id= 'compare-total']")
    private WebElement productCompare;

    @FindBy(xpath = ".//*[@id= 'list-view']")
    private WebElement listViewButton;

    @FindBy(xpath = ".//*[@id= 'grid-view']")
    private WebElement gridViewButton;

    @FindBy(xpath = ".//*[@class = 'alert alert-success alert-dismissible']")
    private WebElement successfulMessage;

    public void waitForElement() {
        WebDriver driver = Driver.DRIVERS.get();
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    }

    public List<ProductContainer> getProducts() {
        List<ProductContainer> productContainers = new ArrayList<>();
        for (WebElement element : products) {
            productContainers.add(new ProductContainer(element));
        }
        return productContainers;
    }
}
