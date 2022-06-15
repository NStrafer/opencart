package steps;

import models.UserModel;
import org.testng.Assert;
import pages.ChangePasswordPage;
import pages.MyAccountPage;

public class ChangePasswordPageBL {
    private ChangePasswordPage changePasswordPage;
    private MyAccountPage myAccountPage;

    public ChangePasswordPageBL() {
        changePasswordPage = new ChangePasswordPage();
    }

    public ChangePasswordPageBL changePassword(UserModel userModel) {
        inputPassword(userModel.getPassword());
        inputPasswordConfirm(userModel.getPasswordConfirm());
        clickOnChangePasswordContinueButton();
        myAccountPage = new MyAccountPage();
        return this;
    }

    private void inputPassword(String password) {
        changePasswordPage.getChangePasswordInput().clear();
        changePasswordPage.getChangePasswordInput().sendKeys(password);
    }

    private void inputPasswordConfirm(String passwordConfirm) {
        changePasswordPage.getChangePasswordConfirmInput().clear();
        changePasswordPage.getChangePasswordConfirmInput().sendKeys(passwordConfirm);
    }

    private void clickOnChangePasswordContinueButton() {
        changePasswordPage.getChangePasswordContinueButton().click();
    }

    public ChangePasswordPageBL verifySuccessfulChangePassword() {
        String expectedMessage = "Success: Your password has been successfully updated.";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Error!");
        return this;
    }

    public ChangePasswordPageBL checkNegativeChangePassword() {
        String expectedMessage = "Error!";
        Assert.assertEquals(myAccountPage.getSuccessfulEditAccountMessage().getText(), expectedMessage, "Success: Your password has been successfully updated.");
        return this;
    }
}
