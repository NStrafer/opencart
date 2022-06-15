package steps;

import org.testng.Assert;
import pages.ComparePage;
import pages.containers.CompareContainer;

public class ComparePageBL {

    private ComparePage comparePage;

    public ComparePageBL() {
        comparePage = new ComparePage();
    }

    public ComparePageBL addProductToCartFromComparePage(String productName) {
        CompareContainer products = comparePage.getProducts()
                .stream()
                .filter(e -> e.getProductTitle().getText().equals(productName))
                .findFirst()
                .orElseThrow(NullPointerException::new);
        comparePage.waitForElement();
        products.getAddToCartButton().click();
        comparePage.waitForElement();
        return this;
    }

    public ComparePageBL verifyAddToShoppingCart() {
        comparePage.waitForElement();
        Assert.assertTrue(comparePage.getSuccessfulMessage().getText().contains("Success: "));
        return this;
    }
}
