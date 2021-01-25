package com.day06.question4;

public class Animal {
    int age;
    String color;
    String style;

    public Animal() {
    }

    public Animal(int age, String color, String style) {
        this.age = age;
        this.color = color;
        this.style = style;
    }

    public void eat() {
        System.out.println(age + "岁的" + color + "的" + style + "在吃饭");
    }
}
