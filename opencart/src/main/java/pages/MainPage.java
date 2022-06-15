package pages;

import driver.Driver;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.containers.ProductContainer;

@Getter
public class MainPage extends BasePage {

    @FindBy(xpath = "//p[@class='price']")
    private List<WebElement> price;
  
    @FindBy(xpath = "//button[contains(@onclick,'cart.add')]")
    private List<WebElement> productsAddToCart;

    @FindBy(xpath = "//a[text()='shopping cart']")
    private WebElement successfulAddProductLinkToShoppingCart;
  
    @FindBy(xpath = ".//*[contains(@class,'product-layout')]")
    private List<WebElement> products;

    @FindBy(xpath = ".//*[text() = 'product comparison']")
    private WebElement productComparison;

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
  
//  public WebElement getAlert() {
//        wait.until(ExpectedConditions.visibilityOf(alert));
//        return alert;
//    }
//  public WebElement getComparisonAlert() {
//        wait.until(ExpectedConditions.visibilityOf(comparisonAlert));
//        return comparisonAlert;
//    }
  
}

