package com.learnjava.example.encapsulation.collection.listdemo;


import com.learnjava.example.encapsulation.collection.model.Person;

import java.util.ArrayList;
import java.util.List;

public class ForEachMutableTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setId(1l);
        p1.setName("Sourav");
        p1.setEmail("s@s.com");
        p1.setPhoneNumber("+34632822055");

        Person p2 = new Person();
        p2.setId(2l);
        p2.setName("Pranab");
        p2.setEmail("p@p.com");
        p2.setPhoneNumber("+3457878788");

        Person p3 = new Person();
        p3.setId(3l);
        p3.setName("Sashi");
        p3.setEmail("sahi@gmail.com");
        p3.setPhoneNumber("+3457878655");

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);

        System.out.println(personList);
        for (Person p :personList) {
            p.setName(p.getName().toUpperCase() + "-" + "change");
            //personList.remove(p);
        }
        System.out.println(personList);

    }
}
