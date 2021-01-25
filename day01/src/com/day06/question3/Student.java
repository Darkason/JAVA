package com.day06.question3;

public class Student extends Person {
    private int grade;

    public void test() {
        System.out.println(getName() + " is testing " + grade);
    }

    public Student() {
    }

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
