package pages;


import driver.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage() {
        driver = Driver.DRIVERS.get();
        wait = new WebDriverWait(driver, 300);
        PageFactory.initElements(driver, this);
    }

}