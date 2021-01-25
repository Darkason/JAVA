package com.day06.question1;

public class Test {
    public static void main(String[] args) {
        Coder coder = new Coder();
        coder.name = "WQ";
        coder.age = 14;
        Coder.code();
        coder.sleep();
        coder.eat();
        System.out.println("---------------");
        Teacher teacher = new Teacher();
        teacher.name = "Te";
        teacher.age = 34;
        teacher.teach();
        teacher.sleep();
        teacher.eat();
    }
}
