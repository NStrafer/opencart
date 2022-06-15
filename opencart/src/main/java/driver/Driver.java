package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Driver {
    public static final ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();

    private static WebDriver webDriver;

    public static void downloadWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser() {
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
    }

    public static void closeBrowser() {
        webDriver.close();
    }

    public static void driverGet(String url) {
        webDriver.get(url);
    }

    public static void waitForcibly() {
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void waitForElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);wait.until(ExpectedConditions.visibilityOfElementLocated((By) element));
    }
    public static void waitBeClickable(WebElement element){
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
         wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public static void switchToAlertAndAccept(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().accept();
    }
    public static void switchToAlertAndCancel(){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.alertIsPresent());
        webDriver.switchTo().alert().dismiss();
    }
    public static void waitUntilVisible(WebElement element){
        WebDriverWait wait = new WebDriverWait(webDriver,10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

}
