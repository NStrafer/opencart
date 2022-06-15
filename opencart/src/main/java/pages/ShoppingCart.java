package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import pages.containers.CheckoutContainer;
import pages.containers.ShoppingCartContainer;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class ShoppingCart extends BasePage{
    @FindBy(xpath = "//div[@class='table-responsive']//tbody")
    private List<WebElement> products;

    @FindBy(xpath = "//a[@href='#collapse-coupon']")
    private WebElement useCouponCodeDropButton;

    @FindBy(id = "input-coupon")
    private WebElement couponInput;

    @FindBy(id = "button-coupon")
    private WebElement applyCouponButton;

    @FindBy(xpath = "//a[@href='#collapse-shipping']")
    private WebElement estimateShippingAndTaxesDropButton;

    @FindBy(id = "input-country")
    private Select countrySelect;

    @FindBy(id = "input-zone")
    private Select regionAndStateSelect;

    @FindBy(id = "input-postcode")
    private WebElement postCodeInput;

    @FindBy(id = "button-quote")
    private WebElement getQuotesButton;

    @FindBy(xpath = "//a[@href='#collapse-voucher']")
    private WebElement useGiftCertificateDropButton;

    @FindBy(id = "input-voucher")
    private WebElement voucherInput;

    @FindBy(id = "button-voucher")
    private WebElement applyGiftCertificateButton;

    @FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//tr[1]/td[2]")
    private WebElement subTotalPriceText;

    @FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//tr[2]/td[2]")
    private WebElement ecoTaxPriceText;

    @FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//tr[3]/td[2]")
    private WebElement vatText;

    @FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//tr[4]/td[2]")
    private WebElement totalPriceText;

    @FindBy(xpath = "//a[text()='Checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//a[text()='Continue Shopping']")
    private WebElement continueShoppingButton;

    @FindBy(xpath = "//div[@class='col-sm-4 col-sm-offset-8']//tbody/tr/td[1]")
    private List<WebElement> taxTitles;

    @FindBy(xpath = "//strong[text()='Sub-Total:']")
    private WebElement checkoutPriceElementForVisible;
  
    @FindBy(xpath = "//div[@id = 'top-links']//a[@title='Shopping Cart']")
    private WebElement shoppingCartButton;


    public List<ShoppingCartContainer> getProducts() {
        return products.stream().map(ShoppingCartContainer::new).collect(Collectors.toList());
    }
    public WebElement getProductInCart(String productName) {
        return wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='table-responsive']//table[contains(@class,'table table-bordered')]//a[text() = '"+productName+"']"))));
    }
    public WebElement getShoppingCartButton() {
        wait.until(ExpectedConditions.visibilityOf(shoppingCartButton));
        return shoppingCartButton;
    }

}
