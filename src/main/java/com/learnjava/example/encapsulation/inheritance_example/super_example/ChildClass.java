package com.learnjava.example.encapsulation.inheritance_example.super_example;

public class ChildClass extends ParentClass {
    private String str;
    public ChildClass(int i, String str) {
        super(i);
        this.str = str;
    }

    public String getStr() {
        return str;
    }
    @Override
    public int getI() {
        return super.getI() + 1;
    }
}
