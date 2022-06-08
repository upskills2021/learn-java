package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId("1");
        student1.setName("Student1");
        student1.setGpa("3.5");
        student1.setGrade("A");

        Student student2 = new Student();
        student2.setStudentId("2");
        student2.setName("Student2");
        student2.setGpa("3.6");
        student2.setGrade("A");

        Map<Student, String> map = new LinkedHashMap<>();

        map.put(student2, student2.getStudentId());
        map.put(student1, student1.getStudentId());
        System.out.println(map);
    }
}
