package repository;

import models.UserModel;
import org.apache.commons.lang3.RandomStringUtils;

public class RegisterRepository {

    private RegisterRepository() {
    }

    public static UserModel getValidRegisterUser() {
        String password = RandomStringUtils.randomAlphabetic(5);
        return UserModel.builder()
                .setFirstName(RandomStringUtils.randomAlphabetic(5))
                .setLastName(RandomStringUtils.randomAlphabetic(7))
                .setEmail(RandomStringUtils.randomAlphabetic(5) + "@gmail.com")
                .setTelephone(RandomStringUtils.randomNumeric(10))
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }
}
