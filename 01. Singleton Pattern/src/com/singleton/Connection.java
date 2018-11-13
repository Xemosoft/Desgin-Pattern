package com.singleton;

public class Connection {

    private static Connection connectionInstance;
    private String username;
    private String password;

    private Connection() {
    }


    public static Connection getInstance(){
        if (connectionInstance == null){
            connectionInstance = new Connection();
        }
        return connectionInstance;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Connection{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
