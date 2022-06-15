package steps;

import driver.Driver;
import pages.AdminLoginPage;
import pages.AdminNavigationPage;

public class AdminNavigationPageBL {

    private AdminNavigationPage adminNavigationPageBL;

    public AdminNavigationPageBL() {
        adminNavigationPageBL = new AdminNavigationPage();
    }

    public AdminNavigationPageBL navigateToTaxRatePage() {
        dropSettingsButton();
        dropLocalizationButton();
        dropTaxesDropButton();
        clickTaxRatesButton();
        return this;
    }

    public AdminNavigationPageBL navigateToTaxRatesPage() {
        clickTaxRatesButton();
        return this;
    }

    public AdminNavigationPageBL navigateToCurrenciesPage() {
        dropSettingsButton();
        dropLocalizationButton();
        clickCurrenciesButton();
        return this;
    }

    public AdminNavigationPageBL dropSettingsButton() {
        Driver.waitBeClickable(adminNavigationPageBL.getSettingsDropButton());
            adminNavigationPageBL.getSettingsDropButton().click();
        return this;
    }

    public AdminNavigationPageBL dropLocalizationButton() {
        Driver.waitBeClickable(adminNavigationPageBL.getLocalizationDropButton());
        adminNavigationPageBL.getLocalizationDropButton().click();
        return this;
    }

    public AdminNavigationPageBL clickCurrenciesButton() {
        Driver.waitBeClickable(adminNavigationPageBL.getCurrenciesButton());
        adminNavigationPageBL.getCurrenciesButton().click();
        return this;
    }

    public AdminNavigationPageBL dropTaxesDropButton() {
        Driver.waitBeClickable(adminNavigationPageBL.getTaxesDropButton());
        adminNavigationPageBL.getTaxesDropButton().click();
        return this;
    }

    public AdminNavigationPageBL clickTaxRatesButton() {
        Driver.waitBeClickable(adminNavigationPageBL.getTaxRatesButton());
        adminNavigationPageBL.getTaxRatesButton().click();
        return this;
    }

    public AdminNavigationPageBL clickTaxClassesButton() {
        Driver.waitBeClickable(adminNavigationPageBL.getTaxClassesButton());
        adminNavigationPageBL.getTaxClassesButton().click();
        return this;
    }

    public AdminNavigationPageBL navigateToProductCatalog() {
        Driver.waitBeClickable(adminNavigationPageBL.getCatalogDropButton());
        adminNavigationPageBL.getCatalogDropButton().click();
        Driver.waitBeClickable(adminNavigationPageBL.getProductsButton());
        adminNavigationPageBL.getProductsButton().click();
        return this;
    }
}
