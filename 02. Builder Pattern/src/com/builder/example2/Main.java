package com.builder.example2;

public class Main {

    public static void main(String[] args) {

        User user = new User.Builder()
                .withId(1L)
                .withName("bob")
                .withEmail("bob@gmail.com")
                .withPassword("123456")
                .withPhone("25193012312312")
                .build();

        System.out.println(user);

    }

}
