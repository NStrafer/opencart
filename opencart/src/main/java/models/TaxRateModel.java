package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaxRateModel {
private String taxName;
private String taxRate;
private boolean taxType;
private boolean customerGroup;
private String geoZone;

    private TaxRateModel(){}
    public static TaxRateModel.Builder builder() {
        return new TaxRateModel().new Builder();
    }
    public class Builder{

        public TaxRateModel.Builder setTaxName(String name) {
            taxName = name;
            return this;
        }

        public TaxRateModel.Builder setTaxRate(String rate) {
            taxRate = rate;
            return this;
        }

        public TaxRateModel.Builder setTaxType(boolean type) {
            taxType = type;
            return this;
        }

        public TaxRateModel.Builder setCustomerGroup(boolean group) {
            customerGroup = group;
            return this;
        }

        public TaxRateModel.Builder setGeoZone(String zone) {
            geoZone = zone;
            return this;
        }
        public TaxRateModel build() {
            return TaxRateModel.this;
        }
    }
}
