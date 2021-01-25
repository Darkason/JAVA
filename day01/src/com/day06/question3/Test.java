package com.day06.question3;

public class Test {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Java");
        Student student = new Student("yaso",15,90);
        teacher.setName("老王");
        teacher.setAge(30);
        teacher.teach();
        student.test();
    }
}
