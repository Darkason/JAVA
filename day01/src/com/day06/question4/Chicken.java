package com.day06.question4;

public class Chicken extends Animal {
    @Override
    public void eat() {
        System.out.println(age + "岁的" + color + "的" + style + "在啄米");
    }

    public void scream() {
        System.out.println(age + "岁的" + color + "的" + style + "在打鸣");
    }

    public Chicken() {
    }

    public Chicken(int age, String color, String style) {
        super(age, color, style);
    }
}
