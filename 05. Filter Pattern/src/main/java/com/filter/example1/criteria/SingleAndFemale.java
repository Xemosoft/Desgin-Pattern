package com.filter.example1.criteria;

import com.filter.example1.Person;

import java.util.List;

public class SingleAndFemale implements Criteria {

    private Criteria isSingle;
    private Criteria isFemale;

    public SingleAndFemale(Criteria isSingle, Criteria isFemale) {
        this.isSingle = isSingle;
        this.isFemale = isFemale;
    }

    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> single = isSingle.meetCriteria(personList);
        return isFemale.meetCriteria(single);
    }
}
