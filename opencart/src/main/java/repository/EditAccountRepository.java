package repository;

import models.UserModel;
import org.apache.commons.lang3.RandomStringUtils;

public class EditAccountRepository {

    private EditAccountRepository() {
    }

    public static UserModel getValidEditAccount() {
        return UserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .setEmail(RandomStringUtils.randomAlphabetic(8) + "@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .build();
    }

    public static UserModel getFirstNameEdit() {
        return UserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(8))
                .build();
    }

    public static UserModel getLastNameEdit() {
        return UserModel.builder()
                .setLastName(RandomStringUtils.randomAlphabetic(8))
                .build();
    }

    public static UserModel getEmailEdit() {
        return UserModel.builder()
                .setEmail(RandomStringUtils.randomAlphabetic(8) + "@gmail.com")
                .build();
    }

    public static UserModel getTelephoneEdit() {
        return UserModel.builder()
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .build();
    }

    public static UserModel getInvalidTelephoneEdit() {
        return UserModel.builder()
                .setTelephone(RandomStringUtils.randomAlphabetic(10))
                .build();
    }
}
