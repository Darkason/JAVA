package com.day06.question4;

public class Test {
    public static void main(String[] args) {
        Chicken chicken = new Chicken(2,"红色","公鸡");
        Duck duck = new Duck(1,"黑色","鸭子");
        chicken.eat();
        chicken.scream();
        duck.eat();
        duck.swimming();
    }
}
