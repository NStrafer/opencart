package steps;

import enums.AdminLoginData;
import org.openqa.selenium.ElementNotInteractableException;
import pages.AdminLoginPage;
import utils.AdminPasswordGetter;

import static enums.AdminLoginData.ADMIN_PASSWORD;
import static enums.AdminLoginData.ADMIN_USERNAME;
import static enums.Url.BASIC_URL;

public class AdminLoginPageBL {
    private AdminLoginPage adminLoginPageBL;

    public AdminLoginPageBL() {
        adminLoginPageBL = new AdminLoginPage();
    }

    public AdminLoginPageBL loginAdmin(){
        fillUserNameInput(ADMIN_USERNAME.getAdminData());
        fillPasswordInput(ADMIN_PASSWORD.getAdminData());
        clickLoginButton();
        return this;
    }
    public AdminLoginPageBL fillUserNameInput(String userName) {
        try {
            adminLoginPageBL.getUserNameInput().clear();
        } catch (ElementNotInteractableException cannotInteract) {
            adminLoginPageBL.getUserNameInput().clear();
        }
        adminLoginPageBL.getUserNameInput().sendKeys(userName);
        return this;
    }

    public AdminLoginPageBL fillPasswordInput(String password) {
        try {
            adminLoginPageBL.getPasswordInput().clear();
        } catch (ElementNotInteractableException cannotInteract) {
            adminLoginPageBL.getPasswordInput().clear();
        }
        adminLoginPageBL.getPasswordInput().sendKeys(password);
        return this;
    }

    public AdminLoginPageBL clickForgottenPasswordButton() throws InterruptedException {
        try {
            adminLoginPageBL.getForgottenPasswordButton().click();
        } catch (ElementNotInteractableException notInteractive) {
            Thread.sleep(1000);
            adminLoginPageBL.getForgottenPasswordButton().click();
        }
        return this;
    }

    public AdminLoginPageBL clickLoginButton() {
        try {
            adminLoginPageBL.getLoginButton().click();
        } catch (ElementNotInteractableException loginButtonIsNotInteractive) {
            adminLoginPageBL.getLoginButton().click();
        }
        return this;
    }

}
