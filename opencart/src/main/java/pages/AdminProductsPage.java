package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
@Getter
public class AdminProductsPage extends BasePage{

    @FindBy(xpath = "//tbody/tr/td[3]")
    private List<WebElement> productName;
}
