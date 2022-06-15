package basePackage;

import driver.Driver;
import enums.Url;
import org.testng.annotations.Test;


public class SimpleTest extends BaseTest {

    @Test(description = "check shopping cart access")
    public void TryTest() throws InterruptedException {
        Driver.driverGet(Url.SHOPPING_CART_URL.getUrlValue());
        Thread.sleep(10000);
    }

}
