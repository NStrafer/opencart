package repository;

//import models.ChangePasswordModel;
import models.EditCurrencyModel;
import models.TaxRateModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import java.util.Locale;

public class TaxRateModelRepository {


    private TaxRateModelRepository() {
    }

    public static TaxRateModel getValidTaxRate(){
        return TaxRateModel.builder()
                .setTaxName (RandomStringUtils.randomAlphabetic(4).toUpperCase(Locale.ROOT))
                .setTaxRate(String.valueOf(RandomUtils.nextDouble(0,20)))
                .setTaxType(RandomUtils.nextBoolean())
                .setCustomerGroup(true)
                .setGeoZone(String.valueOf(RandomUtils.nextInt(3,4)))
                        .build();

    }
}