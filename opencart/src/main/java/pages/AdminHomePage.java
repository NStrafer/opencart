package pages;

import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.AdminHomePageLatestOrderContainer;

import java.util.List;
import java.util.stream.Collectors;

@Getter
public class AdminHomePage extends BasePage {
    @FindBy(id = "button-developer")
    private WebElement developerSettingButton;

    @FindBy(xpath = "//div[@class= 'col-lg-3 col-md-3 col-sm-6'][1]//h2")
    private WebElement totalOrdersText;

    @FindBy(xpath = "//div[@class= 'col-lg-3 col-md-3 col-sm-6'][2]//h2")
    private WebElement totalSalesText;

    @FindBy(xpath = "//div[@class= 'col-lg-3 col-md-3 col-sm-6'][3]//h2")
    private WebElement totalCustomersText;

    @FindBy(xpath = "//div[@class= 'col-lg-3 col-md-3 col-sm-6'][4]//h2")
    private WebElement peopleOnlineText;

    @FindBy(xpath = "//div[@class = 'col-lg-3 col-md-3 col-sm-6'][1]//a[text()='View more...']")
    private WebElement totalOrdersViewMoreButton;

    @FindBy(xpath = "//div[@class = 'col-lg-3 col-md-3 col-sm-6'][2]//a[text()='View more...']")
    private WebElement totalSalesViewMoreButton;

    @FindBy(xpath = "//div[@class = 'col-lg-3 col-md-3 col-sm-6'][3]//a[text()='View more...']")
    private WebElement totalCustomersViewMoreButton;

    @FindBy(xpath = "//div[@class = 'col-lg-3 col-md-3 col-sm-6'][4]//a[text()='View more...']")
    private WebElement peopleOnlineViewMoreButton;

    @FindBy(xpath = "//div[@class='jqvmap-zoomin']")
    private WebElement zoomInMapButton;

    @FindBy(xpath = "//div[@class='jqvmap-zoomout']")
    private WebElement zoomOutMapButton;

    @FindBy(xpath = "//div[@class='pull-right']//a[@class='dropdown-toggle']")
    private WebElement dropDownTimeRangeButton;

    @FindBy(xpath = "//ul[@id='range']//li[1]/a")
    private WebElement todayRangeSalesAnalyticsButton;

    @FindBy(xpath = "//ul[@id='range']//li[2]/a")
    private WebElement weekRangeSalesAnalyticsButton;

    @FindBy(xpath = "//ul[@id='range']//li[3]/a")
    private WebElement monthRangeSalesAnalyticsButton;

    @FindBy(xpath = "//ul[@id='range']//li[4]/a")
    private WebElement yearRangeSalesAnalyticsButton;

    @FindBy(xpath = "//table[@class='table']/tbody")
    private List<WebElement> latestOrders;

    public List<AdminHomePageLatestOrderContainer> getOrders() {
        return latestOrders.stream().map(AdminHomePageLatestOrderContainer::new).collect(Collectors.toList());
    }
}
