package models;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class EditCurrencyModel {

    private String currencyTitle;
    private String currencyCode;
    private String symbolLeft;
    private String symbolRight;
    private String decimalPlaces;
    private String currencyValue;
    private String currencyStatus;

    private EditCurrencyModel() {
    }

    public static EditCurrencyModel.Builder builder() {
        return new EditCurrencyModel().new Builder();
    }

    public class Builder {

        public EditCurrencyModel.Builder setCurrencyTitle(String title) {
            currencyTitle = title;
            return this;
        }

        public EditCurrencyModel.Builder setCurrencyCode(String code) {
            currencyCode = code;
            return this;
        }

        public EditCurrencyModel.Builder setSymbolLeft(String beforeSymbol){
            symbolLeft = beforeSymbol;
            return this;
        }

        public EditCurrencyModel.Builder setSymbolRight(String afterSymbol){
            symbolRight = afterSymbol;
            return this;
        }

        public EditCurrencyModel.Builder setDecimalPlaces(String decimal){
            decimalPlaces = decimal;
            return this;
        }

        public EditCurrencyModel.Builder setValue(String value){
            currencyValue = value;
            return this;
        }

        public EditCurrencyModel build() {
            return EditCurrencyModel.this;
        }
    }
}
