package steps;

import pages.WishList;
import pages.containers.WishListContainer;


public class WishListBL {

    private WishList wishList;

    public WishListBL wishListProductAddToCart(String productName){
        WishListContainer product = wishList.getProducts().stream().filter(e -> e.productGetName().equalsIgnoreCase(productName)).findFirst().orElseThrow(NullPointerException::new);
        product.wishListAddToCart().click();
        return this;
    }
}
