package com.learnjava.example.encapsulation.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/employee-out.txt"));
            Employee e1 = (Employee) ois.readObject();
            Employee e2 = (Employee) ois.readObject();
            Employee e3 = (Employee) ois.readObject();
            System.out.println(e1);
            System.out.println(e2);
            System.out.println(e3);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
