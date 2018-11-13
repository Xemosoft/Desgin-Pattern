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
