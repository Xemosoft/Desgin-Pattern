package com.filter.example1.criteria;

import com.filter.example1.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    public List<Person> meetCriteria(List<Person> personList) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : personList) {
            if (person.getGender().equalsIgnoreCase("female")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
