package com.day04;

public class Manager {
    private String name;
    private int number;
    private float pay;
    private float bonus;

    public void intro() {
        System.out.println("姓名：" + name + ",工号：" + number);
    }

    public void showSalary() {
        System.out.println("薪资：" + pay + "，奖金" + bonus);
    }

    public void work() {
        System.out.println("正在努力写代码......");
    }

    public Manager() {
    }

    public Manager(String name, int number, float pay, float bonus) {
        this.name = name;
        this.number = number;
        this.pay = pay;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public float getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }
}
