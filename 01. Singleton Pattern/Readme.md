# 1. Singleton Pattern

In software engineering, the singleton pattern is a software design pattern that restricts the instantiation of a class to one object. This is useful when exactly one object is needed to coordinate actions across the system. The concept is sometimes generalized to systems that operate more efficiently when only one object exists, or that restrict the instantiation to a certain number of objects. The term comes from the mathematical concept of a singleton.


`Singleton design pattern is more like creating a single object for the whole application. Suppose your are a client 
you need a connection to connect to some server. Do you really need to create the connection every time while running the application ? Answer is Big No. 
Besides, creating a object is costly. So , we are going to create a single object for the whole application and reuse it when it is necessary.`

**Source Code**
1. Connection.java
```java
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

```

2. Main.java
```java
package com.singleton;

public class Main {

    public static void main(String[] args) {

        // same Instance
        Connection conn = Connection.getInstance();
        System.out.println(conn.hashCode());

        // same Instance
        Connection connection = Connection.getInstance();
        System.out.println(connection.hashCode());

        if (conn == connection){
            System.out.println("They are same."); // same object
        }else{
            System.out.println("They are different.");
        }

    }

}

```