package com.learnjava.example.encapsulation.inheritance_example;

public class InheritanceTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId("1");
        student.setCollegeName("XYZ");
        student.setFirstName("Sourav");
        student.setLastName("Maitra");
        student.setPhoneNo("+918777568745");
        student.setEmail("a@a.com");
        student.setAddress(populateAddress());
        System.out.println(student);
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
