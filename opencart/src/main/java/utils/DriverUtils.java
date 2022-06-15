package utils;


import driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverUtils {

    private WebDriver driver;

    public DriverUtils(){
        driver = Driver.DRIVERS.get();
    }

    public void clickOnElementJS(WebElement element){
        getJSExecutor().executeScript("arguments[0].click()", element);
    }

    private JavascriptExecutor getJSExecutor(){
        return (JavascriptExecutor) driver;
    }

}