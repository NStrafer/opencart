package steps;

import models.TaxRateModel;
import org.openqa.selenium.support.ui.Select;
import pages.AdminAddTaxRatePage;
import pages.AdminTaxRatesPage;
import repository.TaxRateModelRepository;

public class AdminAddTaxRateBL {

    private AdminAddTaxRatePage adminAddTaxRatesPage;

    public AdminAddTaxRateBL() {
        adminAddTaxRatesPage = new AdminAddTaxRatePage();
    }
    public AdminAddTaxRateBL buildTaxRate(TaxRateModel taxRateModel){
       fillTaxNameInput(taxRateModel.getTaxName());
       fillTaxRateInput(taxRateModel.getTaxRate());
       selectTypeTaxRate(taxRateModel.isTaxType());
       checkCustomerGroupCheckbox(taxRateModel.isCustomerGroup());
       selectGeoZone(taxRateModel.getGeoZone());
       return this;
    }
    public String getTaxName(){
        return adminAddTaxRatesPage.getTaxNameInput().getAttribute("value");
    }

    public void fillTaxNameInput(String taxName){
        adminAddTaxRatesPage.getTaxNameInput().clear();
        adminAddTaxRatesPage.getTaxNameInput().sendKeys(taxName);
    }
    public void fillTaxRateInput(String taxName){
        adminAddTaxRatesPage.getTaxRateInput().clear();
        adminAddTaxRatesPage.getTaxRateInput().sendKeys(taxName);
    }
    public void selectTypeTaxRate(boolean chooseType){
        Select typeTaxRate = new Select(adminAddTaxRatesPage.getTaxTypeSelect());
        String value;
        if(chooseType){
             value = "P";
        }else { value = "F";}
        typeTaxRate.selectByValue(value);
    }
    public void checkCustomerGroupCheckbox(boolean checkOrNot) {
        if (checkOrNot) {
            if (!adminAddTaxRatesPage.getCustomerGroupCheckbox().isSelected()) {
                adminAddTaxRatesPage.getCustomerGroupCheckbox().click();
            }
        }
        if (!checkOrNot) {
            if (adminAddTaxRatesPage.getCustomerGroupCheckbox().isSelected()) {
                adminAddTaxRatesPage.getCustomerGroupCheckbox().click();
            }
        }
    }

    public void selectGeoZone(String value){
        Select geoZoneSelect = new Select(adminAddTaxRatesPage.getGeoZoneSelect());
        geoZoneSelect.selectByValue(String.valueOf(value));
    }
    public AdminTaxRatesPageBL clickSaveNewTaxRateButton(){
        adminAddTaxRatesPage.getSaveTaxRateButton().click();
        return new AdminTaxRatesPageBL();
    }

}
