package repository;

import models.UserModel;
import org.testng.reporters.jq.Model;

public class LoginRepository {

    private LoginRepository() {
    }

    public static UserModel getLoginUser() {
         return UserModel.builder()
                 .setEmail("admin@gmail.com")
                 .setPassword("admin")
                 .build();
        }
    }
