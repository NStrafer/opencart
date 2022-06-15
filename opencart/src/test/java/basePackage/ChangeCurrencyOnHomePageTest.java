package basePackage;

import driver.Driver;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.HeaderPageBL;
import steps.MainPageBL;

import static enums.Url.BASIC_URL_NSTRAFER;

public class ChangeCurrencyOnHomePageTest extends BaseTest {


    @Test(description = "changeCurrencyOnHomePage")
    public void changeCurrencyOnHomePageTest() {
        new Navigation()
                .navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        new HeaderPageBL()
                .dropCurrencyDropButton();
        int selectedQuantity = new HeaderPageBL()
                .chooseCurrency();
        new HeaderPageBL().dropCurrencyDropButton()
                .verifyCurrencyWasChangedOnHeaderPAge(selectedQuantity);
        new MainPageBL()
                .checkCurrencySymbolOnAllProducts();
    }
}
