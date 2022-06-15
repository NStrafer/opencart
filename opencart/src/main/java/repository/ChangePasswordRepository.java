package repository;

import models.UserModel;
import org.apache.commons.lang3.RandomStringUtils;

public class ChangePasswordRepository {

    private ChangePasswordRepository() {
    }

    public static UserModel getPositiveChangePassword() {
        String password = RandomStringUtils.randomAlphabetic(4);
        return UserModel.builder()
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }

    public static UserModel getNegativeChangePassword() {
        String password = "     ";
        return UserModel.builder()
                .setPassword(password)
                .setPasswordConfirm(password)
                .build();
    }
}
