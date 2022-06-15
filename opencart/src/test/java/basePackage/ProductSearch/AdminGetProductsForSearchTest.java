package basePackage.ProductSearch;

import basePackage.BaseTest;
import navigation.Navigation;
import org.testng.annotations.Test;
import steps.*;

import static enums.Url.*;

public class AdminGetProductsForSearchTest extends BaseTest {

    @Test
    public void searchProductByAdminProductPage(){
        new Navigation()
                .navigateToUrl(ADMIN_URL.getUrlValue());
        new AdminLoginPageBL()
                .loginAdmin();
        new AdminNavigationPageBL()
                .navigateToProductCatalog();
        String productName = new AdminProductsPageBL().getProductsName();
        new Navigation()
                .navigateToUrl(BASIC_URL_NSTRAFER.getUrlValue());
        new SearchFieldBL()
                .typeSearchProduct(productName)
                .clickOnSearchButton();
        new SearchPageBL()
                .CheckSearch(productName);
    }
}
