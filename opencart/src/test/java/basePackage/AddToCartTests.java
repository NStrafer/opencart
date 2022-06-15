package basePackage;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.ProductPageBL;

import static enums.Url.BASIC_URL;

public class AddToCartTests extends BaseTest {

    @Test
    public void addProductToCart() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .addProductToCart("iPhone")
                .verifyAddToShoppingCart();
    }

    @Test
    public void addTwoProductsToCart() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .addProductToCart("iPhone")
                .verifyAddToShoppingCart()
                .addProductToCart("MacBook")
                .verifyAddToShoppingCart();
    }

    @Test
    public void addFourProductsToCartFromProductPage() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getMenuBL()
                .clickOnDesktopsButton()
                .clickOnShowAllDesktopsButton();
        new ProductPageBL()
                .addProductToCart("iPod Classic")
                .verifyAddToShoppingCart()
                .addProductToCart("HTC Touch HD")
                .verifyAddToShoppingCart()
                .addProductToCart("Sony VAIO")
                .verifyAddToShoppingCart()
                .addProductToCart("Palm Treo Pro")
                .verifyAddToShoppingCart();
    }
}
