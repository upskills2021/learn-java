package com.learnjava.example.encapsulation.java8.functional_interface;

import com.learnjava.example.encapsulation.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    static final BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " - " + activities);

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(student -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });

        BiConsumer<Integer, Integer> oprAdd = (a,b) -> System.out.println("Sum of two numbers : " + (a+b));
        oprAdd.accept(1,2);

        BiConsumer<String, String> stringConcatOpr = (s1,s2) -> System.out.println("Final Result :: " + s1.concat(" ").concat(s2));
        stringConcatOpr.accept("Sourav" , "Maitra");
    }
}
