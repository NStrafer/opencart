package steps;

import pages.MyAccountPage;

public class MyAccountPageBL {

    private MyAccountPage myAccountPage;

    public MyAccountPageBL() {
        myAccountPage = new MyAccountPage();
    }

    public MyAccountPageBL clickOnEditYourAccountInformation() {
        myAccountPage.getEditYourAccountInformation().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL clickOnChangeYourPassword() {
        myAccountPage.getChangeYourPassword().click();
        return new MyAccountPageBL();
    }

    public MyAccountPageBL clickOnLogoutButton() {
        myAccountPage.getLogout().click();
        return new MyAccountPageBL();
    }
}
