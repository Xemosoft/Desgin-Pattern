package com.filter.example1;

public class Person {

    private Integer personId;
    private String personName;
    private String gender;
    private boolean married;

    public Person(){}

    public Person(Integer personId, String personName, String gender, boolean married) {
        this.personId = personId;
        this.personName = personName;
        this.gender = gender;
        this.married = married;
    }

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", gender='" + gender + '\'' +
                ", married=" + married +
                '}';
    }
}
