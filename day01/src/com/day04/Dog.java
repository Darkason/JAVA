package com.day04;

public class Dog {
    private String name;
    private int age;
    private double money;

    public void eat() {
        System.out.println(name + "在干饭" + age + money);
    }

    public Dog() {
    }

    public Dog(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    //对外的公共方法
    public void setName(String abc) {
        name = abc;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
