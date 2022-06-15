package steps;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import driver.Driver;
import models.EditCurrencyModel;
import navigation.Navigation;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import pages.AdminCurrencyPage;
import pages.AdminEditCurrencyPage;
import pages.HeaderPage;
import repository.EditCurrencyModelRepository;

import javax.swing.*;

import static enums.Url.BASIC_URL_NSTRAFER;

public class AdminCurrencyPageBL {

    private AdminCurrencyPage adminCurrencyPageBL;

    public AdminCurrencyPageBL() {
        adminCurrencyPageBL = new AdminCurrencyPage();
    }

    public AdminCurrencyPageBL deleteLastAddedCurrency(){
        Driver.waitBeClickable(adminCurrencyPageBL.getSortByLastUpdatedButton());
        adminCurrencyPageBL.getSortByLastUpdatedButton().click();
        adminCurrencyPageBL.getCurrencies().get(1).getCurrencyCheckbox().click();
        adminCurrencyPageBL.getDeleteCurrencyValueButton().click();
        Driver.switchToAlertAndAccept();
        return this;
    }

    public AdminCurrencyPageBL clickRefreshCurrencyButton() {
        adminCurrencyPageBL.getRefreshCurrencyValuesButton().click();
        return this;
    }

    public AdminCurrencyPageBL clickAddCurrencyButton() {
        adminCurrencyPageBL.getAddCurrencyValueButton().click();
        return this;
    }

    public void clickDeleteCurrencyButton() {
        adminCurrencyPageBL.getDeleteCurrencyValueButton().click();

    }

    public AdminCurrencyPageBL checkSummaryCurrencyCheckbox(short id) {
        if (!adminCurrencyPageBL.getSummaryCurrencyCheckbox().isSelected()) {
            adminCurrencyPageBL.getSummaryCurrencyCheckbox().click();
        }
        return this;
    }

    public AdminCurrencyPageBL uncheckSummaryCurrencyCheckbox(short id) {
        if (adminCurrencyPageBL.getSummaryCurrencyCheckbox().isSelected()) {
            adminCurrencyPageBL.getSummaryCurrencyCheckbox().click();
        }
        return this;
    }

    public AdminCurrencyPageBL sortByCurrencyTitle() {
        adminCurrencyPageBL.getSortByCurrencyTitleButton().click();
        return this;
    }

    public AdminCurrencyPageBL sortByCurrencyCode() {
        adminCurrencyPageBL.getSortByCodeButton().click();
        return this;
    }

    public AdminCurrencyPageBL sortByCurrencyValue() {
        adminCurrencyPageBL.getSortByValueButton().click();
        return this;
    }

    public AdminCurrencyPageBL sortByLastUpdated(){
        Driver.waitBeClickable(adminCurrencyPageBL.getSortByLastUpdatedButton());
        adminCurrencyPageBL.getSortByLastUpdatedButton().click();
        return this;
    }

    public AdminCurrencyPageBL checkCurrencyCheckbox(short id){
        if(!adminCurrencyPageBL.getCurrencies().get(id).getCurrencyCheckbox().isSelected()){
            adminCurrencyPageBL.getCurrencies().get(id).getCurrencyCheckbox().click();
        }
        return this;
    }
    public AdminCurrencyPageBL uncheckCurrencyCheckbox(short id){
        if(adminCurrencyPageBL.getCurrencies().get(id).getCurrencyCheckbox().isSelected()){
            adminCurrencyPageBL.getCurrencies().get(id).getCurrencyCheckbox().click();
        }
        return this;
    }
    public AdminCurrencyPageBL clickEditCurrencyButton(short id){
        adminCurrencyPageBL.getSortByLastUpdatedButton().click();
        adminCurrencyPageBL.getCurrencies().get(1).getEditCurrencyButton().click();
        return this;
    }
    public AdminCurrencyPageBL verifySuccessfulModifiedOnAdminCurrencyPage(){
        String successfulEditCurrency = "Success: You have modified currencies!";
        Assert.assertTrue(adminCurrencyPageBL.getSuccesfulModifiedCurrency().getText().contains(successfulEditCurrency));
        return this;
    }
    public void verifySuccessfulModifiedOnHomePage(String newTitle){
        new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        new HeaderPageBL().dropCurrencyDropButton();
    }
    public AdminCurrencyPageBL editLastAddedCurrency(){
        adminCurrencyPageBL.getSortByLastUpdatedButton().click();
        adminCurrencyPageBL.getCurrencies().get(1).getEditCurrencyButton().click();
        new AdminEditCurrencyPageBL().editCurrency(EditCurrencyModelRepository.getPositiveCurrencyModel());
        String editedCurrencyCode = new AdminEditCurrencyPageBL().getCodeInputValue();
        new AdminEditCurrencyPageBL().clickSaveCurrency();
        new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        Assert.assertTrue(new HeaderPageBL().dropCurrencyDropButton().checkNewCurrency(editedCurrencyCode));
        return this;
    }
    public AdminCurrencyPageBL verifyCurrencyIsChangedOnHomePage(){
       String addedCurrencyOnAdminPage =  adminCurrencyPageBL.getCurrencies().get(1).getCurrencyTitleText().getText();
       new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
       new HeaderPageBL().dropCurrencyDropButton().checkNewCurrency(addedCurrencyOnAdminPage);
       return this;
    }
    public AdminCurrencyPageBL verifyCurrencyWasDeletedOnHomePage(){
        String addedCurrencyOnAdminPage =  adminCurrencyPageBL.getCurrencies().get(1).getCurrencyTitleText().getText();
        new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        new HeaderPageBL().dropCurrencyDropButton().checkNewCurrency(addedCurrencyOnAdminPage);
        return this;
    }
    public String getCurrencyCode(){
        return  adminCurrencyPageBL.getCurrencies().get(1).getCurrencyCodeText().getText();
    }
}
