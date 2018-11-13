package com.builder;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot.Builder()
                .withId(1)
                .withName("bob")
                .withPassword("bob")
                .withEmail("bob@gmail.com")
                .build();

        System.out.println(robot);

    }

}
