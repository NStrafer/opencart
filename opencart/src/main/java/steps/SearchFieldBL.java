package steps;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import pages.SearchField;

public class SearchFieldBL {

    private SearchField searchField;

    public SearchFieldBL() {
        searchField = new SearchField();
    }

    public SearchFieldBL typeSearchProduct(String productInput) {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(productInput);
        return this;
    }
    public SearchFieldBL typeRandomNumberSearchProduct() {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(String.valueOf(RandomUtils.nextInt()));
        return this;
    }

    public SearchFieldBL typeRandomSymbolSearchProduct() {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(RandomStringUtils.randomAscii(1));
        return this;
    }

    public SearchFieldBL typeRandomFloatSearchProduct() {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(String.valueOf(RandomUtils.nextFloat()));
        return this;
    }
    public SearchFieldBL typeRandomStringSearchProduct() {
        searchField.getSearchInput().clear();
        searchField.getSearchInput().sendKeys(RandomStringUtils.randomAlphabetic(RandomUtils.nextInt(1,100)));
        return this;
    }
    public String getEnteredSearchQuery(){

        return searchField.getSearchInput().getAttribute("value");
    }

    public SearchFieldBL clickOnSearchButton() {
        searchField.getSearchButton().click();
        return this;
    }
}
