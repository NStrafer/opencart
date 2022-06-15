package steps;

import driver.Driver;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import pages.MainPage;
import pages.containers.ProductContainer;

public class MainPageBL {

    private MainPage mainPage;

    public MainPageBL() {
        mainPage = new MainPage();
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }

    public MenuBL getMenuBL() {
        return new MenuBL();
    }

    public MainPageBL checkCurrencySymbolOnAllProducts(){
        String selectedCurrencyOnHomePage = new HeaderPageBL().getSelectedCurrencyLeftSymbol();
        for(WebElement price: mainPage.getPrice()){
            Assert.assertTrue(price.getText().contains(selectedCurrencyOnHomePage));
        }
        return this;
    }
  
    public MainPageBL addRandomProductToCart(){
        int quantityProducts = mainPage.getProductsAddToCart().size();
        mainPage.getProductsAddToCart().get(1).click();
        return this;
    }
    public MainPageBL clickOnLinkToShoppingCart(){
        Driver.waitBeClickable(mainPage.getSuccessfulAddProductLinkToShoppingCart());
        mainPage.getSuccessfulAddProductLinkToShoppingCart().click();
        return this;
    }

    public MainPageBL addProductToCart(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        mainPage.waitForElement();
        product.getAddToCartButton().click();
        return this;
    }

    public MainPageBL addProductToComparePage(String productName) {
        ProductContainer product = mainPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        mainPage.waitForElement();
        product.getAddToCompareButton().click();
        return this;
    }

    public MainPageBL clickOnProductComparison() {
        mainPage.waitForElement();
        mainPage.getProductComparison().click();
        return new MainPageBL();
    }

    public MainPageBL verifyAddToShoppingCart() {
        mainPage.waitForElement();
        Assert.assertTrue(mainPage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }

    public MainPageBL verifyAddToCompare() {
        mainPage.waitForElement();
        Assert.assertTrue(mainPage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }
}
