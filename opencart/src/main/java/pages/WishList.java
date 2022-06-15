package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.containers.WishListContainer;

import java.util.List;
import java.util.stream.Collectors;

public class WishList {

    @FindBy(xpath= ".//*[@id= 'wishlist-total']")
    public WebElement wishList;

    @FindBy(xpath = "//div[@id = 'content']//tbody/tr")
    private List<WebElement> products;

    public List<WishListContainer> getProducts() {
        return products.stream().map(WishListContainer::new).collect(Collectors.toList());
    }
}