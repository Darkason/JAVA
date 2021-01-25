package com.day07.question4;

public abstract class Person {
    String name;
    int age;
    abstract void eat();

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}
