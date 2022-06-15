package AdminCurrenciesTests;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.*;

import static enums.Url.ADMIN_URL;

public class AdminAddCurrencyTest extends BaseTest {
    @Test(priority = 1)
    public void addAdminCurrencyTest() throws InterruptedException {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToCurrenciesPage();
        new AdminCurrencyPageBL()
                .clickAddCurrencyButton();
        new AdminEditCurrencyPageBL()
                .addAndSaveNewCurrency();
    }

    @Test(priority = 2)
    public void editAdminCurrencyTest(){
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToCurrenciesPage();
        new AdminCurrencyPageBL()
                .editLastAddedCurrency();
    }
    @Test(priority = 3)
    public void deleteAdminCurrencyTest(){
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToCurrenciesPage();
        new AdminCurrencyPageBL()
                .deleteLastAddedCurrency()
                .verifySuccessfulModifiedOnAdminCurrencyPage();
    }
}
