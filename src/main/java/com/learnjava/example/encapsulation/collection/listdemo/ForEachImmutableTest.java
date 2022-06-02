package com.learnjava.example.encapsulation.collection.listdemo;

import java.util.ArrayList;
import java.util.List;

public class ForEachImmutableTest {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("alpha");
        lst.add("beta");
        lst.add("charlie");
        System.out.println(lst);
        for (String str : lst) {
           // lst.remove(str);
            str += "change!";   // cannot modify "immutable" objects

        }
        System.out.println(lst);
    }
}
