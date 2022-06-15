package AdminTaxTests;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import repository.TaxRateModelRepository;
import steps.*;

import static enums.Url.ADMIN_URL;
import static enums.Url.BASIC_URL_NSTRAFER;

public class AddTaxOnAdminPageTest extends BaseTest {
    @Test(priority = 1)
    public void addAdminTaxRateTest() {
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToTaxRatePage();
        new AdminTaxRatesPageBL()
                .clickAddTaxButton();
        new AdminAddTaxRateBL()
                .buildTaxRate(TaxRateModelRepository.getValidTaxRate());
        String newTaxName = new AdminAddTaxRateBL().getTaxName();
        new AdminAddTaxRateBL().clickSaveNewTaxRateButton()
                .verifySuccessfulAddTaxRateMessage();
        new AdminTaxRatesPageBL().verifySuccessfulAddTaxRateOnPage(newTaxName);
        new AdminNavigationPageBL()
                .clickTaxClassesButton();
        new AdminTaxClassesPageBL()
                .editTaxableGoodsClass();
        new AdminEditTaxClassPageBL()
                .clickAddRuleButton()
                .setNewTaxRate(newTaxName);
        new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        new MainPageBL()
                .addRandomProductToCart();
        new MainPageBL()      .clickOnLinkToShoppingCart();
              new ShoppingCartBL()
                      .verifyTaxOnShoppingCart(newTaxName);
    }
    @Test(priority = 2)
    public void editAdminRateTest(){
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToTaxRatePage();
        new AdminTaxRatesPageBL().sortByDateModified().clickEditTax(0);
        new AdminAddTaxRateBL().buildTaxRate(TaxRateModelRepository.getValidTaxRate());
        String newTaxName = new AdminAddTaxRateBL().getTaxName();
        new AdminAddTaxRateBL().clickSaveNewTaxRateButton()
                .verifySuccessfulAddTaxRateMessage();
        new AdminTaxRatesPageBL().verifySuccessfulAddTaxRateOnPage(newTaxName);
        new Navigation()
                .navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        new MainPageBL()
                .addRandomProductToCart();
        new HeaderPageBL()
                .clickOnShoppingCartButton();
        new ShoppingCartBL().verifyTaxOnShoppingCart(newTaxName);
   }

    @Test(priority = 3)
    public void deleteAdminRateTest(){
        new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        AdminNavigationPageBL adminNavigationPageBL = new AdminNavigationPageBL()
                .navigateToTaxRatePage();
        new AdminTaxRatesPageBL()
                .sortByDateModified()
                .clickEditTax(0);
        String deleteByTaxName = new AdminAddTaxRateBL().getTaxName();
        new AdminAddTaxRateBL()
                .clickSaveNewTaxRateButton()
                .verifySuccessfulAddTaxRateMessage();
        adminNavigationPageBL
                .clickTaxClassesButton();
        new AdminTaxClassesPageBL()
                .editTaxableGoodsClass()
                .clickRemoveRuleButton();
        adminNavigationPageBL
                .navigateToTaxRatesPage();
        new AdminTaxRatesPageBL()
                .deleteTaxRateByName(deleteByTaxName)
                .clickDeleteTax();
    }
}
