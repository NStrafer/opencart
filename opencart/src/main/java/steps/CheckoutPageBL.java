package steps;

import models.CheckoutModel;
import org.testng.Assert;
import pages.CheckoutPage;
import pages.SuccessfulOrderPage;
import utils.DriverUtils;

public class CheckoutPageBL {

    private CheckoutPage checkoutPage;
    private SuccessfulOrderPage successfulOrderPage;

    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
    }

    public CheckoutPageBL makeOrderAsGuest(CheckoutModel checkoutModel) {
        chooseCheckoutOptions("guest");
        clickOnContinueButton();
        inputFirstName(checkoutModel.getFirstName());
        inputLastName(checkoutModel.getLastName());
        inputEmail(checkoutModel.getEmail());
        inputTelephone(checkoutModel.getTelephone());
        inputCompany(checkoutModel.getCompany());
        inputAddress1(checkoutModel.getAddress1());
        inputCity(checkoutModel.getCity());
        inputPostCode(checkoutModel.getPostCode());
        chooseCountry(220);
        chooseRegion(3493);
        clickOnContinueButtonDetails();
        clickOnContinueButtonDelivery();
        clickTermsAndConditionCheckbox();
        clickOnContinueButtonPayment();
        clickOnConfirmButton();
        successfulOrderPage = new SuccessfulOrderPage();
        return this;
    }

    public CheckoutPageBL makeOrderAsLoginUser(CheckoutModel checkoutModel) {
        inputFirstName(checkoutModel.getFirstName());
        inputLastName(checkoutModel.getLastName());
        inputCompany(checkoutModel.getCompany());
        inputAddress1(checkoutModel.getAddress1());
        inputCity(checkoutModel.getCity());
        inputPostCode(checkoutModel.getPostCode());
        chooseCountry(220);
        chooseRegion(3493);
        clickOnContinueButtonDetails();
        chooseAddress("existing");
        clickOnContinueButtonForLoginUser();
        clickOnContinueButtonDelivery();
        clickTermsAndConditionCheckbox();
        clickOnContinueButtonPayment();
        clickOnConfirmButton();
        successfulOrderPage = new SuccessfulOrderPage();
        return this;
    }


    private void chooseCheckoutOptions(String value) {
        new DriverUtils().clickOnElementJS(checkoutPage.getCheckOutOptions(value));
    }

    private void clickOnContinueButton() {
        checkoutPage.getContinueButton().click();
    }

    private void inputFirstName(String firstName) {
        checkoutPage.getFirstName().clear();
        checkoutPage.getFirstName().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        checkoutPage.getLastName().clear();
        checkoutPage.getLastName().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        checkoutPage.getEmail().clear();
        checkoutPage.getEmail().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        checkoutPage.getTelephone().clear();
        checkoutPage.getTelephone().sendKeys(telephone);
    }

    private void inputCompany(String company) {
        checkoutPage.getCompany().clear();
        checkoutPage.getCompany().sendKeys(company);
    }

    private void inputAddress1(String address) {
        checkoutPage.getAddress1().clear();
        checkoutPage.getAddress1().sendKeys(address);
    }

    private void inputCity(String city) {
        checkoutPage.getCity().clear();
        checkoutPage.getCity().sendKeys(city);
    }

    private void inputPostCode(String postCode) {
        checkoutPage.getPostCode().clear();
        checkoutPage.getPostCode().sendKeys(postCode);
    }

    private void chooseCountry(int value) {
        new DriverUtils().clickOnElementJS(checkoutPage.getCountry(value));
    }

    private void chooseRegion(int value) {
        new DriverUtils().clickOnElementJS(checkoutPage.getRegion(value));
    }

    private void clickOnContinueButtonDetails() {
        checkoutPage.getContinueButtonDetails().click();
    }

    private void clickOnContinueButtonDelivery() {
        checkoutPage.getContinueButtonDelivery().click();
    }

    private void clickTermsAndConditionCheckbox() {
        checkoutPage.getTermsAndConditionsAgree().click();
    }

    private void clickOnContinueButtonPayment() {
        checkoutPage.getContinueButtonPayment().click();
    }

    private void clickOnConfirmButton() {
        checkoutPage.getConfirmButton().click();
    }

    private void chooseAddress(String value) {
        new DriverUtils().clickOnElementJS(checkoutPage.getAddress(value));
    }

    private void clickOnContinueButtonForLoginUser() {
        checkoutPage.getContinueButtonForLoginUser().click();
    }

    public CheckoutPageBL verifyOrder() {
        String expectedMessage = "Your order has been placed!";
        Assert.assertEquals(successfulOrderPage.getSuccessfulOrderMessage().getText(), expectedMessage, "Error!");
        return this;
    }
}
