package com.learnjava.example.encapsulation.collection.sorting;

import com.learnjava.example.encapsulation.collection.model.Person;

import java.util.List;

public class PersonSortingUsingComparator {
    public static void main(String[] args) {
        List<Person> persons = PersonTestObjectFactory.getAllPersons();
        System.out.println("Person List Before Sorting");
        System.out.println(persons);
        persons.sort(new PersonNameComparator().thenComparing(new PersonIdComparator()));
        System.out.println("Person List after Sorting");
        System.out.println(persons);
    }
}
