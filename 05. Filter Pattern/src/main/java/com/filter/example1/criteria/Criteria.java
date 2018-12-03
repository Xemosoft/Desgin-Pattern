package com.filter.example1.criteria;

import com.filter.example1.Person;

import java.util.List;

public interface Criteria {

    List<Person> meetCriteria(List<Person> personList);

}
