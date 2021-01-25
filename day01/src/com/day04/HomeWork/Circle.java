package com.day04.HomeWork;

import com.day04.Circle1;

public class Circle {
    public static void main(String[] args) {
//        无参方法调用
        Circle1 circle1 = new Circle1();
        circle1.setR(20);
        circle1.showArea();
        circle1.showPerimeter();
//        有参方法调用
        Circle1 circle2 = new Circle1(10);
        circle2.showPerimeter();
        circle2.showArea();
    }
}
