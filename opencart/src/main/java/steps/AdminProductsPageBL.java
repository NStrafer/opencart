package steps;

import org.apache.commons.lang3.RandomUtils;
import pages.AdminProductsPage;

public class AdminProductsPageBL {
    private AdminProductsPage adminProductsPage;

    public AdminProductsPageBL() {
        adminProductsPage = new AdminProductsPage();
    }

    public String getProductsName(){
        int valueProducts = adminProductsPage.getProductName().size();
        int idProduct = RandomUtils.nextInt(0, valueProducts);
        String productName = adminProductsPage.getProductName().get(idProduct).getText();
        return productName;
    }
}
