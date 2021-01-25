package com.day06.question4;

public class Duck extends Animal {
    public void swimming() {
        System.out.println(age + "岁的" + color + "的" + style + "在游泳");
    }

    public Duck() {
    }

    public Duck(int age, String color, String style) {
        super(age, color, style);
    }
}
