package dev.kentoso.authsystem.web.dto;

public class UserRegisterDto {
    
    private String username;
    private String email;
    private String password;


    public UserRegisterDto(String username, String email, String password) {
        super();
        this.username = username;
        this.email = email;
        this.password = password;
    }


    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
