package enums;

public enum ShoppingCartBasicValues {

    QUANTITY_BASIC(1);

    private final int quantityBasic;

    ShoppingCartBasicValues(int quantityBasic){
        this.quantityBasic = quantityBasic;
    }

    public int quantityBasic(){
        return quantityBasic;
    }

}
