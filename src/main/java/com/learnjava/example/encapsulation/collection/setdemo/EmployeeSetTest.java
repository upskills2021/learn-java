package com.learnjava.example.encapsulation.collection.setdemo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSetTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "Sourav", 30, new BigDecimal("10000.0"));
        Employee employee2 = new Employee(2, "Prakash", 29, new BigDecimal("20000.0"));
        Employee employee3 = new Employee(3, "Avay", 38, new BigDecimal("40000.0"));
        Employee employee4 = new Employee(4, "Srikanth", 25, new BigDecimal("20000.0"));
        Set<Employee> employees = new HashSet<>(Set.of(employee1, employee2, employee3, employee4));
        System.out.println(employees);
        employees.add(new Employee(3, "Avay", 38, new BigDecimal(20000)));
        System.out.println(employees);
        employees.add(new Employee(3, "Avay1", 38, new BigDecimal(20000)));
        System.out.println(employees);

        Set<Employee> employeeSet = Set.of(employee1, employee2, employee3, employee4);
        System.out.println("Example of EmployeeSet");
        System.out.println(employeeSet);
        Set<Employee> linkedHashSet1 = new LinkedHashSet<>(employeeSet);
        System.out.println("Example of LinkedHashSet created from Set.of");
        System.out.println(linkedHashSet1);

        Set<Employee> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(employee1);
        linkedHashSet.add(employee2);
        linkedHashSet.add(employee3);
        linkedHashSet.add(employee4);
        System.out.println("Example of LinkedHashSet");
        System.out.println(linkedHashSet);
    }
}
