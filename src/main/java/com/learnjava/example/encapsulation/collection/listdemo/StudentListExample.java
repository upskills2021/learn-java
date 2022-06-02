package com.learnjava.example.encapsulation.collection.listdemo;

import com.learnjava.example.encapsulation.collection.model.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentListExample {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1l);
        student1.setName("Harry");

        Student student2 = new Student();
        student2.setId(1l);
        student2.setName("Charlie");

        Student student3 = new Student();
        student3.setId(1l);
        student3.setName("John");

        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

       // System.out.println(students);

       //iterateUsingForLoop(students);
        iterateUsingUsingIterator(students);
        System.out.println(students);
    }

    private static void iterateUsingUsingIterator(List<Student> students) {
        Iterator<Student> itr = students.listIterator();
        while (itr.hasNext()) {
            Student student = itr.next();
            System.out.println(student);
        }
    }

    private static void iterateUsingForLoop(List<Student> students) {
        for (Student student: students) {
            System.out.println(student);
            students.remove(student);
        }
    }
}
