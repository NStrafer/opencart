package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Getter
public class ShoppingCartPage extends BasePage {
    @FindBy(xpath = "/html/body/div[2]/div/div/h1")
    private WebElement ShoppingCartHeaderText;

    @FindBy(xpath = "//div[@id = 'content']//td[1]//a[contains(@href,'route=product/product&product_id=')]")
    private List<WebElement> productImage;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/table/tbody/tr/td[2]/a")
    private List<WebElement> productNameLink;

    @FindBy(xpath = "//*[@id=\"content\"]/form/div/table/tbody/tr/td[3]")
    private List<WebElement> productModelName;

    @FindBy(xpath = "/html/body/div[2]/div/div/form/div/table/tbody/tr/td[4]/div/input")
    private List<WebElement> quantityInputForm;

    @FindBy(xpath = ".//button[@data-original-title='Update']")
    private List<WebElement> quantityRefreshButton;

    @FindBy(xpath = ".//button[@data-original-title='Remove']")
    private List<WebElement> quantityRemoveButton;

    @FindBy(xpath = "//div[@id='checkout-cart']//tbody//td[5]")
    private List<WebElement> unitPriceText;

    @FindBy(xpath = "//div[@id='checkout-cart']//tbody//td[6]")
    private List<WebElement> totalPriceText;

    @FindBy(xpath = ".//a[contains(@href, 'coupon')]")
    private WebElement useCouponDropButton;

    @FindBy(id = "input-coupon")
    private WebElement inputCoupon;

    @FindBy(id = "button-coupon")
    private WebElement applyCouponButton;

    @FindBy(xpath = ".//a[text() = 'Estimate Shipping & Taxes ']")
    private WebElement estimateShippingAndTaxesDropButton;

    @FindBy(xpath = "//select[@name = 'country_id']")
    private WebElement countrySelect;

    @FindBy(xpath = ".//select[@name='zone_id']")
    private WebElement regionAndStateSelect;

    @FindBy(xpath = ".//input[@name='postcode']")
    private WebElement postCodeInput;

    @FindBy(id = "button-quote")
    private WebElement getQuotesButton;

    @FindBy(xpath = ".//a[@href='#collapse-voucher']")
    private WebElement useGiftCertificateDropButton;

    @FindBy(id = "input-voucher")
    private WebElement giftCertificationInput;

    @FindBy(xpath = "//*[@id='content']/div[2]/div/table/tbody/tr[1]/td[2]")
    private WebElement subTotal;

    @FindBy(xpath = "//*[@id='content']/div[2]/div/table/tbody/tr[2]/td[2]")
    private WebElement exoTax;

    @FindBy(xpath = "//*[@id='content']/div[2]/div/table/tbody/tr[3]/td[2]")
    private WebElement vat;

    @FindBy(xpath = "//*[@id='content']/div[2]/div/table/tbody/tr[4]/td[2]")
    private WebElement totalPrice;

    @FindBy(xpath = "//div[@class = 'buttons clearfix']//*[text()='Checkout']")
    private WebElement checkoutButton;

    @FindBy(xpath = "//a[text()= 'Continue Shopping']")
    private WebElement continueShoppingButton;


}
