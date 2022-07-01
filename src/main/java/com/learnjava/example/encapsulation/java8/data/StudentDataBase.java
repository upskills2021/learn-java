package com.learnjava.example.encapsulation.java8.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDataBase {

    public static Supplier<Student> studentSupplier = () -> {
        //return  new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));
        return null;
    };

    public static Optional<Student> getOptionalStudent(){

        Student student = new Student("Adam",2,4.0,"male", Arrays.asList("swimming", "basketball","volleyball"));

        Bike bike = new Bike("Client123", "Client123");
        student.setBike(Optional.of(bike));
        return Optional.of(student);
    }


    /**
     * Total of 6 students in the database.
     * @return
     */
    public static List<Student> getAllStudents(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student(1,"Adam",2,3.6, "male",10,Arrays.asList("swimming", "basketball","volleyball"));
        Student student2 = new Student(3,"Jenny",2,3.8,"female", 11,Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 3rd grade students
         */
        Student student3 = new Student(2,"Emily",3,4.0,"female", 12,Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student(4, "Dave",3,4.0,"male", 15,Arrays.asList("swimming", "gymnastics","soccer"));
        /**
         * 4th grade students
         */
        Student student5 = new Student(6,"Sophia",4,3.5,"female",10, Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student(5,"James",4,3.9,"male", 22,Arrays.asList("swimming", "basketball","baseball","football"));
        Student student7 = new Student(7, "James",4,3.8,"male", 22,Arrays.asList("swimming", "basketball","baseball","football"));

        List<Student> students = Arrays.asList(student1,student2,student3,student4,student5,student6, student7);
        return students;
    }
}
