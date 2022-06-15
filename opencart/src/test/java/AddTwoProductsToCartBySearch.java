import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.ShoppingCartBL;

import static enums.Url.BASIC_URL;

public class AddTwoProductsToCartBySearch extends BaseTest {
//    @Test
//    public void addIphoneAndiMacToCartBySearch() {
//        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
//        MainPageBL mainPageBL = new MainPageBL();
//        String product1 = "iPhone";
//        mainPageBL.getHeaderPageBL()
//                .clickOnSearchField()
//                .sendNameToSearchField(product1)
//                .clickOnSearchButton()
//                .addProductToCart(product1);
//        mainPageBL.verifySuccessAddToCart(product1);
//        String product2 = "iMac";
//        mainPageBL.getHeaderPageBL()
//                .clickOnSearchField()
//                .sendNameToSearchField(product2)
//                .clickOnSearchButton()
//                .addProductToCart(product2);
//        mainPageBL.verifySuccessAddToCart(product2);
//        ShoppingCartBL shoppingCartPage = mainPageBL.getHeaderPageBL()
//                .clickOnShoppingCartButton();
//        shoppingCartPage.clickOnShoppingCartButton();
//        shoppingCartPage.verifyProductInCart(product1);
//        shoppingCartPage.verifyProductInCart(product2);
//    }
}