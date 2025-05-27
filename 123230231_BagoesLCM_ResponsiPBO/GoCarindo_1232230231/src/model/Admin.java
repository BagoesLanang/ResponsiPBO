package model;

public class Admin {
    private final String username = "admin1";
    private final String password = "1234";
    
    public boolean login (String user, String pass){
        return username.equals(user) && password.equals(pass);
    }
    
}