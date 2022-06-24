package com.learnjava.example.encapsulation.java8.functional_interface;

import com.learnjava.example.encapsulation.java8.data.Student;
import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    static final Consumer<Student> c1 = (student) -> System.out.println(student.getName().toUpperCase());
    static final Consumer<Student> c2 = (student) -> System.out.println(student.getActivities());

     public static void main(String[] args) {
         List<Student> students = StudentDataBase.getAllStudents();
         students.forEach(student -> {
             if (student.getGpa() >= 3.9 && student.getGradeLevel() >= 4) {
                 c1.andThen(c2).accept(student);
             }
         });
    }
}
