package steps;

import models.UserModel;
import org.testng.Assert;
import pages.EditAccountPage;
import pages.MyAccountPage;

public class EditAccountPageBL {

    private EditAccountPage editAccountPage;
    private MyAccountPage myAccountPage;

    public EditAccountPageBL() {
        editAccountPage = new EditAccountPage();
    }

    public EditAccountPageBL editInformation(UserModel userModel) {
        editFirstName(userModel.getFirstName());
        editLastName(userModel.getLastName());
        editEmail(userModel.getEmail());
        editTelephone(userModel.getTelephone());
        clickOnEditContinueButton();
        myAccountPage = new MyAccountPage();
        return this;
    }

    public EditAccountPageBL editFirstNameOnly(UserModel userModel) {
        editFirstName(userModel.getFirstName());
        clickOnEditContinueButton();
        myAccountPage = new MyAccountPage();
        return this;
    }

    public EditAccountPageBL editLastNameOnly(UserModel userModel) {
        editLastName(userModel.getLastName());
        clickOnEditContinueButton();
        myAccountPage = new MyAccountPage();
        return this;
    }

    public EditAccountPageBL editEmailOnly(UserModel userModel) {
        editEmail(userModel.getEmail());
        clickOnEditContinueButton();
        myAccountPage = new MyAccountPage();
        return this;
    }

    public EditAccountPageBL editTelephoneOnly(UserModel userModel) {
        editTelephone(userModel.getTelephone());
        clickOnEditContinueButton();
        myAccountPage = new MyAccountPage();
        return this;
    }

    public void editFirstName(String firstname) {
        editAccountPage.getEditFirstNameInput().clear();
        editAccountPage.getEditFirstNameInput().sendKeys(firstname);
    }

    private void editLastName(String lastname) {
        editAccountPage.getEditLastNameInput().clear();
        editAccountPage.getEditLastNameInput().sendKeys(lastname);
    }

    private void editEmail(String email) {
        editAccountPage.getEditEmailInput().clear();
        editAccountPage.getEditEmailInput().sendKeys(email);
    }

    private void editTelephone(String telephone) {
        editAccountPage.getEditTelephoneInput().clear();
        editAccountPage.getEditTelephoneInput().sendKeys(telephone);
    }

    private void clickOnEditContinueButton() {
        editAccountPage.getEditContinueButton().click();
    }

    public EditAccountPageBL verifySuccessfulEditInformation() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Error!");
        return this;
    }

    public EditAccountPageBL checkEditTelephoneInvalid() {
        String expectedMessage = "Invalid telephone number";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Success: Your account has been successfully updated.");
        return this;
    }

    public EditAccountPageBL clickOnEditBackButton() {
        return new EditAccountPageBL();
    }
}

