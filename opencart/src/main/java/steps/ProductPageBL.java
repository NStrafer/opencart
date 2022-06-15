package steps;

import org.testng.Assert;
import pages.ProductPage;
import pages.containers.ProductContainer;

public class ProductPageBL {

    private ProductPage productPage;

    public ProductPageBL() {
        productPage = new ProductPage();
    }

    public ProductPageBL addProductToCart(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        productPage.waitForElement();
        product.getAddToCartButton().click();
        return this;
    }

    public ProductPageBL addProductToComparePage(String productName) {
        ProductContainer product = productPage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        productPage.waitForElement();
        product.getAddToCompareButton().click();
        return this;
    }

    public ProductPageBL clickOnProductCompare() {
        productPage.getProductCompare().click();
        return new ProductPageBL();
    }

    public ProductPageBL clickOnListViewButton() {
        productPage.getListViewButton().click();
        return this;
    }

    public ProductPageBL verifyAddToShoppingCart() {
        productPage.waitForElement();
        Assert.assertTrue(productPage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }

    public ProductPageBL verifyAddToComparePage() {
        productPage.waitForElement();
        Assert.assertTrue(productPage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }
}
