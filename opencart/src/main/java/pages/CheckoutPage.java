package pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.CheckoutContainer;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class CheckoutPage extends BasePage {

    @FindBy(xpath = ".//*[@id= 'button-account']")
    private WebElement continueButton;

    @FindBy(xpath = ".//*[@id='button-login']")
    private WebElement loginButton;

    @FindBy(xpath = ".//*[@id='input-payment-firstname']")
    private WebElement firstName;

    @FindBy(xpath = ".//*[@id='input-payment-lastname']")
    private WebElement lastName;

    @FindBy(xpath = ".//*[@id='input-payment-email']")
    private WebElement email;

    @FindBy(xpath = ".//*[@id='input-payment-telephone']")
    private WebElement telephone;

    @FindBy(xpath = ".//*[@id='input-payment-company']")
    private WebElement company;

    @FindBy(xpath = ".//*[@id='input-payment-address-1']")
    private WebElement address1;

    @FindBy(xpath = ".//*[@id='input-payment-address-2']")
    private WebElement address2;

    @FindBy(xpath = ".//*[@id='input-payment-city']")
    private WebElement city;

    @FindBy(xpath = ".//*[@id='input-payment-postcode']")
    private WebElement postCode;

    @FindBy(xpath = ".//*[@id ='button-payment-address']")
    private WebElement continueButtonForLoginUser;

    @FindBy(xpath = ".//*[@name= 'shipping_address']")
    private WebElement agreeButton;

    @FindBy(xpath = ".//*[@id='button-guest']")
    private WebElement continueButtonDetails;

    @FindBy(xpath = ".//*[@value= 'existing']")
    private WebElement useExistingAddressLoginUser;

    @FindBy(xpath = ".//*[@value='new']")
    private WebElement useNewAddressLoginUser;

    @FindBy(xpath = ".//*[@name='shipping_method']")
    private WebElement deliveryMethod;

    @FindBy(xpath = ".//*[@id='collapse-shipping-method']/div/p[4]/textarea]")
    private WebElement deliveryComment;

    @FindBy(xpath = ".//*[@id ='button-shipping_method']")
    private WebElement continueButtonDelivery;

    @FindBy(xpath = ".//*[@name='payment_method']")
    private WebElement paymentMethod;

    @FindBy(xpath = ".//*[@id= 'collapse-payment-method']/div/p[3]/textarea]")
    private WebElement paymentComment;

    @FindBy(xpath = ".//*[@name='agree']")
    private WebElement termsAndConditionsAgree;

    @FindBy(xpath = ".//*[@id= 'button-payment-method']")
    private WebElement continueButtonPayment;

    @FindBy(xpath = ".//table[@class = 'table table-bordered table-hover']/")
    private List<WebElement> orders;

    @FindBy(xpath = ".//*[@id= 'button-confirm']")
    private WebElement confirmButton;

    public WebElement getCheckOutOptions(String value) {
        return driver.findElement(By.xpath(".//*[@name='account' and @value = '" + value + "']"));
    }

    public WebElement getAddress(String value) {
        return driver.findElement(By.xpath(".//*[@class ='radio' and @value = '" + value + "']"));
    }

    public WebElement getCountry(int value) {
        return driver.findElement(By.xpath(".//*[@id='input-payment-country' and @value = '" + value + "']"));
    }

    public WebElement getRegion(int value) {
        return driver.findElement(By.xpath(".//*[@id= 'input-payment-zone' and @value = '" + value + "']"));
    }

    public List<CheckoutContainer> getOrders() {
        return orders.stream().map(CheckoutContainer::new).collect(Collectors.toList());
    }
}
