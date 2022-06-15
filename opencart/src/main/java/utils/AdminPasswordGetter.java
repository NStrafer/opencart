package utils;

public class AdminPasswordGetter {
    private static String adminPassword;

    public AdminPasswordGetter() {
        adminPassword = System.getenv("OPENCART_ADMIN_PASSWORD");
    }

    public String getAdminPassword() {
        return adminPassword;
    }
}
