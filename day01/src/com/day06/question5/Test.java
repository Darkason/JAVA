package com.day06.question5;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("m110","老王",10000);
        Cooker cooker = new Cooker("c110","小王",6000);
        manager.eat();
        manager.work();
        cooker.eat();
        cooker.work();
    }
}
