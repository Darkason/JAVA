package com.day04;

public class Coder {
    private String name;
    private int number;
    private float pay;

    public void intro() {
        System.out.println("姓名：" + name + ",工号：" + number);
    }

    public void showSalary() {
        System.out.println("薪资：" + pay);
    }

    public void work(){
        System.out.println("正在努力写代码......");
    }

    public Coder() {
    }

    public Coder(String name, int number, float pay) {
        this.name = name;
        this.number = number;
        this.pay = pay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public float getPay() {
        return pay;
    }
}
