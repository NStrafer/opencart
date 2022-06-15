package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@Getter
public class MyAccountPage extends BasePage {

    @FindBy(xpath = ".//h2[text()= 'My Account']")
    private WebElement textMyAccount;

    @FindBy(xpath = ".//*[text()= 'Edit your account information']")
    private WebElement editYourAccountInformation;

    @FindBy(xpath = ".//*[text()= 'Change your password']")
    private WebElement changeYourPassword;

    @FindBy(xpath = ".//*[text()= 'Modify your address book entries']")
    private WebElement modifyYourAddressBookEntries;

    @FindBy(xpath = ".//*[text()= 'Modify your wish list']")
    private WebElement modifyYourWishList;

    @FindBy(xpath = ".//*[text()= 'View your order history']")
    private WebElement viewYourOrderHistory;

    @FindBy(xpath = ".//*[@id= 'content']/ul[2]/li[2]/a")
    private WebElement downloads;

    @FindBy(xpath = ".//*[text()= 'Your Reward Points']")
    private WebElement yourRewardPoints;

    @FindBy(xpath = ".//*[text()= 'View your return requests']")
    private WebElement viewYourReturnRequests;

    @FindBy(xpath = ".//*[text()= 'Your Transactions']")
    private WebElement yourTransactions;

    @FindBy(xpath = ".//*[@id= 'content']/ul[2]/li[6]/a")
    private WebElement recurringPayments;

    @FindBy(xpath = ".//*[text()= 'Register for an affiliate account']")
    private WebElement registerForAnAffiliateAccount;

    @FindBy(xpath = ".//*[text()= 'Subscribe / unsubscribe to newsletter']")
    private WebElement newsletter;

    @FindBy(xpath = ".//a[13][text() = 'Logout']")
    private WebElement logout;

    @FindBy(xpath = ".//*[@class= 'alert alert-success alert-dismissible']")
    private WebElement successfulEditAccountMessage;

    @FindBy(xpath = ".//*[@class= 'alert alert-success alert-dismissible']")
    private WebElement successfulChangePasswordMessage;
}
