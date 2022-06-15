package steps;

import driver.Driver;
import org.openqa.selenium.support.ui.Select;
import pages.AdminEditCurrencyPage;
import pages.AdminEditTaxClassPage;

public class AdminEditTaxClassPageBL {
    private AdminEditTaxClassPage adminEditTaxClassPage;

    public AdminEditTaxClassPageBL() {
        adminEditTaxClassPage = new AdminEditTaxClassPage();
    }

    public AdminEditTaxClassPageBL clickAddRuleButton(){
        Driver.waitBeClickable(adminEditTaxClassPage.getAddRuleButton());
        adminEditTaxClassPage.getAddRuleButton().click();
        return this;
    }
    public AdminEditTaxClassPageBL clickRemoveRuleButton(){
        int quantityRule = adminEditTaxClassPage.getRemoveRuleButton().size()-1;
        Driver.waitBeClickable(adminEditTaxClassPage.getRemoveRuleButton().get(quantityRule));
        adminEditTaxClassPage.getRemoveRuleButton().get(quantityRule).click();
        adminEditTaxClassPage.getSaveButton().click();
        return this;
    }
    public AdminEditTaxClassPageBL clickSaveClassButton(){
        Driver.waitBeClickable(adminEditTaxClassPage.getSaveButton());
        adminEditTaxClassPage.getSaveButton().click();
        return this;
    }

    public AdminTaxClassesPageBL setNewTaxRate(String taxRateTitle){
        int lastTaxRate = adminEditTaxClassPage.getRates().size() - 1;
       Select selectTaxRate = new Select(adminEditTaxClassPage.getRates().get(lastTaxRate).getTaxRateSelect());
       Select selectBasedOn = new Select(adminEditTaxClassPage.getRates().get(lastTaxRate).getBasedOnSelect());
       selectTaxRate.selectByVisibleText(taxRateTitle);
       selectBasedOn.selectByVisibleText("Store Address");
       clickSaveClassButton();
       return new AdminTaxClassesPageBL();
    }
}
