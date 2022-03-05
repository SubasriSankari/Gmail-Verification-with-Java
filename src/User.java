


public class User {
    String username;
    String userpass;
    String code;

    public User() {
    }

    public User(String username, String userpass, String code) {
        this.username = username;
        this.userpass = userpass;
        this.code = code;
    }

    public String getEmail() {
        return username;
    }

    public void setEmail(String username) {
        this.username = username;
    }

    public String getPass() {
        return userpass;
    }

    public void setPass(String userpass) {
        this.userpass = userpass;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    
}
