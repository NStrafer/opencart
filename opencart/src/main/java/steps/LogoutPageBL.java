package steps;

import org.testng.Assert;
import pages.LogoutPage;

public class LogoutPageBL {

    private LogoutPage logoutPage;

    public LogoutPageBL() {
        logoutPage = new LogoutPage();
    }

    public HeaderPageBL getHeaderPageBL() {
        return new HeaderPageBL();
    }
    public LogoutPageBL clickOnContinueButton() {
        logoutPage.getContinueButton().click();
        return new LogoutPageBL();
    }

    public LogoutPageBL verifySuccessfulLogout() {
        String expectedMessage = "Account Logout";
        Assert.assertEquals(logoutPage.getSuccessfulLogoutMessage().getText(), expectedMessage, "Error!");
        return this;
    }


}
