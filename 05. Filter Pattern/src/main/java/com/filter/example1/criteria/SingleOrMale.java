package com.filter.example1.criteria;

import com.filter.example1.Person;

import java.util.List;

public class SingleOrMale implements Criteria {

    private Criteria single;
    private Criteria male;

    public SingleOrMale(Criteria single, Criteria male) {
        this.single = single;
        this.male = male;
    }


    public List<Person> meetCriteria(List<Person> personList) {

        List<Person> singlePersons = single.meetCriteria(personList);
        List<Person> malePersons = male.meetCriteria(personList);

        for (Person malePerson : malePersons) {
            if (!singlePersons.contains(malePerson)) {
                singlePersons.add(malePerson);
            }
        }

        return singlePersons;
    }
}
