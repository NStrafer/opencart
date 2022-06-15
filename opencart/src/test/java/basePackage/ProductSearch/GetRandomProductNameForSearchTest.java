package basePackage.ProductSearch;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.*;

import static enums.Url.ADMIN_URL;
import static enums.Url.BASIC_URL_NSTRAFER;

    public class GetRandomProductNameForSearchTest extends BaseTest {

        @Test(priority = 1)
        public void searchRandomNumber(){
            new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
            new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
            new SearchFieldBL().typeRandomNumberSearchProduct();
            String searchQuery = new SearchFieldBL().getEnteredSearchQuery();
            new SearchFieldBL().clickOnSearchButton();
            new SearchPageBL().checkRandomSearch(searchQuery);
        }

        @Test(priority = 2)
        public void searchRandomString(){
            new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
            new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
            new SearchFieldBL().typeRandomNumberSearchProduct();
            String searchQuery = new SearchFieldBL().getEnteredSearchQuery();
            new SearchFieldBL().clickOnSearchButton();
            new SearchPageBL().checkRandomSearch(searchQuery);
        }

        @Test(priority = 3)
        public void searchRandomFloat(){
           // new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
            new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
            new SearchFieldBL().typeRandomFloatSearchProduct();
            String searchQuery = new SearchFieldBL().getEnteredSearchQuery();
            new SearchFieldBL().clickOnSearchButton();
            new SearchPageBL().checkRandomSearch(searchQuery);
        }

        @Test(priority = 4)
        public void searchRandomSymbol(){
            new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
            new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
            new SearchFieldBL().typeRandomSymbolSearchProduct();
            String searchQuery = new SearchFieldBL().getEnteredSearchQuery();
            new SearchFieldBL().clickOnSearchButton();
            new SearchPageBL().checkRandomSearch(searchQuery);
        }

        @Test(priority = 5)
        public void searchInvalidSymbol() throws InterruptedException {
          //  new Navigation().navigateToUrl(ADMIN_URL.getUrlValue());
            new Navigation().navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
            new SearchFieldBL().typeSearchProduct("%");
            String searchQuery = new SearchFieldBL().getEnteredSearchQuery();
            new SearchFieldBL().clickOnSearchButton();
            new SearchPageBL().checkRandomSearch(searchQuery);
            Thread.sleep(10000);
        }
}
