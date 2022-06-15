
package enums;

public enum AdminLoginData {

    ADMIN_PASSWORD(System.getenv("OPENCART_ADMIN_PASSWORD")),
    ADMIN_USERNAME("admin");

    private final String data;

    AdminLoginData(String data){
        this.data = data;
    }

    public String getAdminData(){
        return data;
    }

}
