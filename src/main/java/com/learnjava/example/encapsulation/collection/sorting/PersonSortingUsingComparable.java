package com.learnjava.example.encapsulation.collection.sorting;

import com.learnjava.example.encapsulation.collection.model.Person;

import java.util.Collections;
import java.util.List;

public class PersonSortingUsingComparable {
    public static void main(String[] args) {
        List<Person> personList = PersonTestObjectFactory.getAllPersons();
        System.out.println(personList);
        Collections.sort(personList);
        System.out.println(personList);
    }
}
