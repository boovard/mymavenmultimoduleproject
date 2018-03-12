package com.switchfully.domain.person;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "My name is " + name + " I'm " + age + "years old.";
    }
}
