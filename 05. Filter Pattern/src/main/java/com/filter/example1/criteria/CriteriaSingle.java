package com.filter.example1.criteria;

import com.filter.example1.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> singlePersons = new ArrayList<Person>();

        for (Person person : personList) {
            if (!person.isMarried()){
                singlePersons.add(person);
            }
        }

        return singlePersons;
    }
}
