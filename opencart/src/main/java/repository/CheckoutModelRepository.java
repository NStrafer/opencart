package repository;

import models.CheckoutModel;
import org.apache.commons.lang3.RandomStringUtils;

public class CheckoutModelRepository {

    private CheckoutModelRepository() {
    }

    public static CheckoutModel guestUserCheckout() {
        return CheckoutModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(5))
                .setLastName(RandomStringUtils.randomAlphabetic(7))
                .setEmail(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .setCompany(RandomStringUtils.randomAlphabetic(7))
                .setAddress1(RandomStringUtils.randomAlphabetic(5) + "Street, " + RandomStringUtils.randomNumeric(2))
                .setCity("L'viv")
                .setPostCode(RandomStringUtils.randomNumeric(5))
                .build();
    }

    public static CheckoutModel loginUserCheckout() {
        return CheckoutModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(5))
                .setLastName(RandomStringUtils.randomAlphabetic(7))
                .setCompany(RandomStringUtils.randomAlphabetic(7))
                .setAddress1(RandomStringUtils.randomAlphabetic(5) + "Street, " + RandomStringUtils.randomNumeric(2))
                .setCity("L'viv")
                .setPostCode(RandomStringUtils.randomNumeric(5))
                .build();
    }
}
