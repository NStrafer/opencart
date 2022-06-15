package basePackage;

import navigation.Navigation;
import org.testng.annotations.Test;
import steps.MainPageBL;
import steps.ProductPageBL;

import static enums.Url.BASIC_URL;

public class AddToCompareTests extends BaseTest {

    @Test
    public void addProductToComparePage() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getMenuBL()
                .clickOnDesktopsButton()
                .clickOnShowAllDesktopsButton();
        new ProductPageBL()
                .addProductToComparePage("MacBook Air")
                .verifyAddToComparePage();
    }
}
