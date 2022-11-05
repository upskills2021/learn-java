package com.learnjava.example.encapsulation.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Employee1");
        Employee e2 = new Employee(101, "Employee2");
        Employee e3 = new Employee(102, "Employee3");
        try {
            FileOutputStream fout = new FileOutputStream("src/main/resources/employee-out.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(e1);
            out.writeObject(e2);
            out.writeObject(e3);
            out.flush();
            out.close();
            fout.close();
            System.out.println("Serialization has been executed successfully");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
