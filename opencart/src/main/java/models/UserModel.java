package models;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String passwordConfirm;

    private UserModel() {
    }

    public static UserModel.Builder builder() {
        return new UserModel().new Builder();
    }

    public class Builder {

        public UserModel.Builder setFirstName(String value) {
            firstName = value;
            return this;
        }

        public UserModel.Builder setLastName(String value) {
            lastName = value;
            return this;
        }

        public UserModel.Builder setEmail(String value) {
            email = value;
            return this;
        }

        public UserModel.Builder setTelephone(String value) {
            telephone = value;
            return this;
        }

        public UserModel.Builder setPassword(String value) {
            password = value;
            return this;
        }

        public UserModel.Builder setPasswordConfirm(String value) {
            passwordConfirm = value;
            return this;
        }

        public UserModel build() {
            return UserModel.this;
        }
    }
}
