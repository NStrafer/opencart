package steps;

import models.UserModel;
import org.testng.Assert;
import pages.MyAccountPage;
import pages.RegisterPage;
import pages.SuccessfulRegisterPage;
import utils.DriverUtils;

public class RegisterPageBL {
    private RegisterPage registerPage;
    private SuccessfulRegisterPage successfulRegisterPage;

    public RegisterPageBL() {
        registerPage = new RegisterPage();
    }


    public RegisterPageBL registerNewPerson(UserModel userModel) {
        inputFirstName(userModel.getFirstName());
        inputLastName(userModel.getLastName());
        inputEmail(userModel.getEmail());
        inputTelephone(userModel.getTelephone());
        inputPassword(userModel.getPassword());
        chooseSubscribe(1);
        clickPolicyCheckbox();
        clickOnContinueButton();
        successfulRegisterPage = new SuccessfulRegisterPage();
        return this;
    }

    private void inputFirstName(String firstName) {
        registerPage.getFirstNameInput().clear();
        registerPage.getFirstNameInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        registerPage.getLastNameInput().clear();
        registerPage.getLastNameInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        registerPage.getEmailInput().clear();
        registerPage.getEmailInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        registerPage.getTelephoneInput().clear();
        registerPage.getTelephoneInput().sendKeys(telephone);
    }

    private void inputPassword(String password) {
        registerPage.getPasswordInput().clear();
        registerPage.getPasswordInput().sendKeys(password);
        registerPage.getPasswordConfirmInput().clear();
        registerPage.getPasswordConfirmInput().sendKeys(password);
    }

    private void chooseSubscribe(int value) {
        new DriverUtils().clickOnElementJS(registerPage.getSubscribeRadioButton(value));
    }

    private void clickPolicyCheckbox() {
        new DriverUtils().clickOnElementJS(registerPage.getPolicy());
    }

    private void clickOnContinueButton() {
        registerPage.getContinueButton().click();
    }

    public RegisterPageBL clickOnSuccessfulRegistrationContinueButton() {
        successfulRegisterPage.getSuccessfulRegistrationContinueButton().click();
        return new RegisterPageBL();
    }

    public RegisterPageBL verifyUserRegistration() {
         String expectedMessage = "Your Account Has Been Created!";
         Assert.assertEquals(successfulRegisterPage.getSuccessfulRegistrationMessage().getText(), expectedMessage, "Error - user has not been registered.");
         return this;
        }
}
