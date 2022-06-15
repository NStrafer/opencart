package repository;

import models.EditCurrencyModel;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;


public class EditCurrencyModelRepository {

    private EditCurrencyModelRepository() {
    }
    public static EditCurrencyModel getPositiveCurrencyModel(){
        return EditCurrencyModel.builder()
                .setCurrencyTitle (RandomStringUtils.randomAlphabetic(4))
                .setCurrencyCode(RandomStringUtils.randomAlphabetic(3).toUpperCase())
                .setSymbolLeft(RandomStringUtils.randomAlphabetic(1))
                .setSymbolRight(RandomStringUtils.randomAlphabetic(1))
                .setDecimalPlaces(RandomStringUtils.randomNumeric(1))
                .setValue(String.valueOf(RandomUtils.nextDouble(0.0000001,1)))
                        .build();
    }
}
