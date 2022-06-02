package com.learnjava.example.encapsulation.collection.sorting;

import com.learnjava.example.encapsulation.collection.model.Person;

import java.util.Comparator;

public class PersonIdComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return p1.getId().compareTo(p2.getId());
    }
}
