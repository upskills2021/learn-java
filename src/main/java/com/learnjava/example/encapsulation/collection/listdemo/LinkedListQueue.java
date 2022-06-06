package com.learnjava.example.encapsulation.collection.listdemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedListQueue {
    public static void main(String[] args) {
        /*
        * Basic functionality of Queue.
          -It will add an element in the end of the queue, because it follows FIFO(First in First Out) principle.
          -It will remove the first element from the queue.
          -We can see the first element of the queue.
        * */

        List<Integer> q = new LinkedList<Integer>();
        q = insert(q,1);
        q = insert(q,2);
        q = insert(q,3);
        System.out.println(q);
        q = remove(q);
        System.out.println(q);

        Integer x = getFirstElement(q);
        System.out.println("First Integer : " + x);
    }

    private static List<Integer> insert(List<Integer> a, Integer x) {
        a.add(x);
        return a;
    }

    private static List<Integer> remove(List<Integer> a) {
        a.remove(0);
        return a;
    }

    private static Integer getFirstElement(List<Integer> a) {
        return a.get(0);
    }
}
