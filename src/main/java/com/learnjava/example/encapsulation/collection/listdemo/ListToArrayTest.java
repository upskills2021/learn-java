package com.learnjava.example.encapsulation.collection.listdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArrayTest {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("alpha");
        lst.add("beta");
        lst.add("charlie");

        // Use the Object[] version
        Object[] strArray1 = lst.toArray();
        System.out.println(Arrays.toString(strArray1));   //[alpha, beta, charlie]
        strArray1[0] = "delta";   // modify the returned array
        System.out.println(Arrays.toString(strArray1));   //[delta, beta, charlie]
        System.out.println(lst);  //[alpha, beta, charlie] (no change in the original list)
    }
}
