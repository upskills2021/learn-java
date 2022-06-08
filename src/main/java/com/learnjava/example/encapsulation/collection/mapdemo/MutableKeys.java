package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.HashMap;
import java.util.Map;

public class MutableKeys {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setStudentId("1");
        student1.setName("Student1");
        student1.setGpa("3.5");
        student1.setGrade("A");

        Student student2 = new Student();
        student2.setStudentId("1");
        student2.setName("Student1");
        student2.setGpa("3.5");
        student2.setGrade("A");

        Student student3 = new Student();
        student3.setStudentId("3");
        student3.setName("Student1");
        student3.setGpa("3.5");
        student3.setGrade("A");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        // Student is mutable class, mutable keys
        Map<Student, String> studentIntegerMap = new HashMap<>();
        studentIntegerMap.put(student1, student1.getStudentId());
        studentIntegerMap.put(student2, student2.getStudentId());
        studentIntegerMap.put(student3, student3.getStudentId());
        System.out.println(studentIntegerMap);
    }
}
