package enums;

public enum Url {

    BASIC_URL("http://localhost/opencart/upload/index.php"),
    BASIC_URL_NSTRAFER("http://localhost/opencart/index.php"),
    ADMIN_URL("http://localhost/opencart/admin/index.php"),
    SHOPPING_CART_URL("http://localhost/opencart/index.php?route=checkout/cart");
    private final String urlValue;

    Url(String urlValue){
        this.urlValue = urlValue;
    }

    public String getUrlValue(){
        return urlValue;
    }

}