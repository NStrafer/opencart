package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SearchField extends BasePage {

    @FindBy(xpath = "//*[@name= 'search']")
    private WebElement searchInput;

    @FindBy(xpath = "//*[@class= 'btn btn-default btn-lg']")
    private WebElement searchButton;
}
