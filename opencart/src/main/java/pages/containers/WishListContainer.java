package pages.containers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WishListContainer {

    private final WebElement rootElement;

    public WishListContainer(WebElement product){
        this.rootElement = product;
    }

    public  WebElement wishListAddToCart(){
        return rootElement.findElement(By.xpath("//button[@type = 'button']/i[@class = 'fa fa-shopping-cart']/.."));
    }

    public String productGetName(){
        return rootElement.findElement(By.xpath("//tr//td[@class = 'text-left']/a")).getText();
    }
}
