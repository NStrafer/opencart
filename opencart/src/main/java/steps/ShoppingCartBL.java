package steps;

import driver.Driver;
import enums.ShoppingCartBasicValues;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.BasePage;
import pages.CheckoutPage;
import pages.ShoppingCart;
import pages.SuccessfulOrderPage;

public class ShoppingCartBL extends BasePage {
    private ShoppingCart shoppingCart;

    public ShoppingCartBL() {
        shoppingCart = new ShoppingCart();
    }

    public ShoppingCartBL clickProductName(short id) {
        shoppingCart.getProducts().get(id).getProductName().click();
        return this;
    }
    public ShoppingCartBL fillQuantityInput(int id, int quantity) {
        try{
            String quantityString = String.valueOf(quantity);
            shoppingCart.getProducts().get(id).getProductName().sendKeys(quantityString);
        }
        catch (IllegalArgumentException quantityException){
            String quantityString = String.valueOf(ShoppingCartBasicValues.QUANTITY_BASIC);
            shoppingCart.getProducts().get(id).getProductName().sendKeys(quantityString);
        }
        return this;
    }

    public ShoppingCartBL clickRefreshButton(short id){
        shoppingCart.getProducts().get(id).getProductQuantityRefreshButton().click();
        return this;
    }
    public ShoppingCartBL clickRemoveButton(short id){
        shoppingCart.getProducts().get(id).getProductQuantityRemoveButton().click();
        return this;
    }
    public ShoppingCartBL dropUseCouponButton(){
        shoppingCart.getUseCouponCodeDropButton().click();
        return this;
    }

    public ShoppingCartBL fillCouponInput(String couponCode){
        shoppingCart.getCouponInput().sendKeys(couponCode);
        return this;
    }

    public ShoppingCartBL clickApplyCouponButton(){
        shoppingCart.getApplyCouponButton().click();
        return this;
    }
    public ShoppingCartBL dropEstimateShippingAndTaxesButton(){
        shoppingCart.getEstimateShippingAndTaxesDropButton().click();
        return this;
    }
    public ShoppingCartBL chooseCountry(String country){
        shoppingCart.getCountrySelect().selectByValue(country);
        return this;
    }
    public ShoppingCartBL chooseRegionAndState(String country){
        shoppingCart.getRegionAndStateSelect().selectByValue(country);
        return this;
    }
    public ShoppingCartBL fillPostCodeInput(String postCode){
        shoppingCart.getPostCodeInput().sendKeys(postCode);
        return this;
    }
    public ShoppingCartBL clickGetQuotesButton(){
        shoppingCart.getGetQuotesButton().click();
        return this;
    }

    public ShoppingCartBL dropUseGiftCertificateDropButton(){
        shoppingCart.getUseGiftCertificateDropButton().click();
        return this;
    }
    public ShoppingCartBL clickCheckoutButton(){
        shoppingCart.getCheckoutButton().click();
        return this;
    }
    public ShoppingCartBL clickContinueShopping(){
        shoppingCart.getContinueShoppingButton().click();
        return this;
    }

    public ShoppingCartBL verifyTaxOnShoppingCart(String taxName){
        boolean isTax = false;
        Driver.waitUntilVisible(shoppingCart.getCheckoutPriceElementForVisible());
        for(WebElement title:shoppingCart.getTaxTitles()){
           if(title.getText().contains(taxName)){
               isTax = true;
           }
        }
        Assert.assertTrue(isTax);
        return this;
    }
    public void verifyProductInCart(String product) {
        Assert.assertTrue(shoppingCart.getProductInCart(product).getText().contains(product), "The product isn`t added to the wish list");
    }
    public ShoppingCartBL clickOnShoppingCartButton() {
        shoppingCart.getShoppingCartButton().click();
        return new ShoppingCartBL();
    }

}

