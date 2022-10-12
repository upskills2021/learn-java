package com.learnjava.example.encapsulation.inheritance_example;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setEmpId("emp-123");
        employee.setEmpTitle("Software Engineer");
        employee.setBasicSalary(100000d);
        employee.setDa(1000d);
        employee.setMa(1000d);
        employee.setHra(10000d);
        employee.setPf(3000d);
        employee.setPt(2000d);
        populatePerson(employee);
        System.out.println(employee);
        employee.printObjectName();
        EmployeeBO employeeBO = new EmployeeBO();
        System.out.println("Employee net income :: " + employeeBO.calculateNetIncome(employee));
    }

    private static void populatePerson(Person p) {
        // Person p = employee;
        // you can assign child class object to parent class reference
        p.setFirstName("Sourav");
        p.setLastName("Maitra");
        p.setEmail("a@a.com");
        p.setPhoneNo("8777568745");
        p.setAddress(populateAddress());
    }
    private static Address populateAddress() {
        Address address = new Address();
        address.setBuildingNo("24/1");
        address.setBuildingName("ABC");
        address.setCity("Kolkata");
        address.setState("WB");
        address.setPostcode("12344455");
        return address;
    }
}
