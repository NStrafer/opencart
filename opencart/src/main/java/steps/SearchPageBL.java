package steps;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.SearchPage;
import pages.ShoppingCart;

public class SearchPageBL {

    private SearchPage searchPage = new SearchPage();


    public SearchPageBL() {
    }

    public SearchPageBL setSearchCategory(String category) {
        searchPage.getSearchFormButton().click();
        for (WebElement target : searchPage.getSearchInCategories()) {
            if (target != null & target.getText().equalsIgnoreCase(category)) {
                target.click();
                break;
            }
        }
        return this;
    }
    public SearchPageBL CheckSearch(String search){
        boolean productContain = true;
        for(WebElement product: searchPage.getProducts() )
            if(!product.getText().contains(search)){
                productContain =  false;
            }
        Assert.assertTrue(productContain);
        return this;
    }
    public SearchPageBL checkRandomSearch(String search){
        boolean productContain = true;
        for(WebElement product: searchPage.getProducts()){
            if(!product.getText().contains(search)){
                productContain = false;
            }
        }
        Assert.assertTrue(productContain);
        return this;
    }

    public SearchPageBL searchInDescription() {
        searchPage.getSearchInDesc().click();
        return this;
    }

    public SearchPageBL searchInSubcategories() {
        searchPage.getSearchInSubCategories().click();
        return this;
    }
}
