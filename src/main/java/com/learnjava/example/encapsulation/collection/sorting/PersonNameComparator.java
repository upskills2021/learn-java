package com.learnjava.example.encapsulation.collection.sorting;

import com.learnjava.example.encapsulation.collection.model.Person;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getName().compareTo(p2.getName());
    }
}
