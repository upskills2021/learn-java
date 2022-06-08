package com.learnjava.example.encapsulation.collection.mapdemo;

import java.util.List;

public class StudentData {

    public static List<Student> getAllStudents() {
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

        Student student3 = new Student();
        student3.setStudentId("3");
        student3.setName("Student3");
        student3.setGpa("3.4");
        student3.setGrade("B");

        Student student4 = new Student();
        student4.setStudentId("4");
        student4.setName("Student4");
        student4.setGpa("3.6");
        student4.setGrade("A");
        return List.of(student1,student2,student3, student4);
    }
}
