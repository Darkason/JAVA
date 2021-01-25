package com.day07.question4;

public class Teacher extends Person{
    public Teacher(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("年龄为"+age+"岁 "+name+" 的老师在吃饭");
    }
}
