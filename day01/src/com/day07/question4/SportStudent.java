package com.day07.question4;

public class SportStudent extends Student implements Sport {
    public SportStudent(String name, int age) {
        super(name, age);
    }

    @Override
    public void playBasketball() {
        System.out.println("年龄为"+age+"岁 "+name+" 的学生在打篮球");
    }
}
