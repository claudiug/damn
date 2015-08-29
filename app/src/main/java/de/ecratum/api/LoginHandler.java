package de.ecratum.api;

/**
 * Created by raluca on 8/29/15.
 */
public class LoginHandler {

    private String username;
    private String password;

    public LoginHandler(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean isUserLogin() {
        return true;
    }


    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LoginHandler{");
        sb.append("username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
