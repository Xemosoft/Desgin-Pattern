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
