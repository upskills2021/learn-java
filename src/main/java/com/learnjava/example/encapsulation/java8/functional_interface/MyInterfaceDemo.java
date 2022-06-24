package com.learnjava.example.encapsulation.java8.functional_interface;

public class MyInterfaceDemo {
    public static void main(String[] args) {

        MyInterface myInterface = new MyInterface() {
            @Override
            public void method1(int i) {
                System.out.println("Inside method1");
            }
        };
        MyInterface myInterface1 = (i) -> System.out.println(i);

        myInterface1.method1(10);
    }
}
