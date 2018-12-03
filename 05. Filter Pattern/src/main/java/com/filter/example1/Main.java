package com.filter.example1;

import com.filter.example1.criteria.*;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(1,"Partha","male",true));
        personList.add(new Person(2,"Dipto","male",false));
        personList.add(new Person(3,"Ajoy","male",true));
        personList.add(new Person(4,"Durjoy","male",false));
        personList.add(new Person(5,"Honey","female",true));
        personList.add(new Person(6,"Rima","female",true));
        personList.add(new Person(7,"Boby","female",false));

        Criteria male = new CriteriaMale();
        System.out.println(male.meetCriteria(personList));

        Criteria female = new CriteriaFemale();
        /*System.out.println(female.meetCriteria(personList));*/

        Criteria single = new CriteriaSingle();
        /*System.out.println(single.meetCriteria(personList));*/

        Criteria singleAndFemale = new SingleAndFemale(single,female);
        /*System.out.println(singleAndFemale.meetCriteria(personList));*/

        SingleOrMale singleOrMale = new SingleOrMale(single, male);
//        System.out.println(singleOrMale.meetCriteria(personList));

//        System.out.println(singleOrMale.meetCriteria(personList).size());

    }

}
