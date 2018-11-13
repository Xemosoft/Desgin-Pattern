# 2. Builder Pattern
The Builder is a design pattern designed to provide a flexible solution to various object creation problems in object-oriented programming. The intent of the Builder design pattern is to separate the construction of a complex object from its representation. It is one of the Gang of Four design patterns.

Builder is flexible and very important in production software.
Suppose, you have a object with many properties and thus you endup with a huge constructor. To solve this kind of problem 
we need to use Builder Pattern. 

**Source Code** 
1. Robot.java
```java
package com.builder;

public class Robot {

    private Integer id;
    private String name;
    private String email;
    private String password;

    public Robot(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static class Builder{

        private Integer id;
        private String name;
        private String email;
        private String password;

        public Robot build(){
            return new Robot(this);
        }

        public Builder withId(Integer id){
            this.id = id;
            return this;
        }

        public Builder withName(String name){
            this.name= name;
            return this;
        }

        public Builder withEmail(String email){
            this.email = email;
            return this;
        }
        public Builder withPassword(String password){
            this.password = password;
            return this;
        }


    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "withId=" + id +
                ", withName='" + name + '\'' +
                ", withEmail='" + email + '\'' +
                ", withPassword='" + password + '\'' +
                '}';
    }
}

```

2. Main.java
```java
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

```
 