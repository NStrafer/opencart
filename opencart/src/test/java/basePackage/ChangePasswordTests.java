package basePackage;

import navigation.Navigation;
import org.testng.annotations.Test;
import repository.ChangePasswordRepository;
import repository.RegisterRepository;
import steps.ChangePasswordPageBL;
import steps.MainPageBL;
import steps.MyAccountPageBL;
import steps.RegisterPageBL;

import static enums.Url.BASIC_URL;

public class ChangePasswordTests extends BaseTest {

    @Test
    public void changePassword() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterRepository.getValidRegisterUser())
                .clickOnSuccessfulRegistrationContinueButton();
        new MyAccountPageBL()
                .clickOnChangeYourPassword();
        new ChangePasswordPageBL()
                .changePassword(ChangePasswordRepository.getPositiveChangePassword())
                .verifySuccessfulChangePassword();
    }

    @Test
    public void changePasswordNegative() {
        new Navigation().navigateToUrl(BASIC_URL.getUrlValue());
        new MainPageBL()
                .getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnRegisterButton()
                .registerNewPerson(RegisterRepository.getValidRegisterUser())
                .clickOnSuccessfulRegistrationContinueButton();
        new MyAccountPageBL()
                .clickOnChangeYourPassword();
        new ChangePasswordPageBL()
                .changePassword(ChangePasswordRepository.getNegativeChangePassword())
                .checkNegativeChangePassword();
    }
}
