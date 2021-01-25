package com.day06.question5;

public class Worker {
    String number;
    String name;
    int pay;
    public void work(){
        System.out.println("工号为;"+number+",姓名未："+name+"工资为:"+pay+"的在工作");
    }
    public void eat(){
        System.out.println("工号为;"+number+",姓名未："+name+"工资为:"+pay+"的在工作,");
    }

    public Worker() {
    }

    public Worker(String number, String name, int pay) {
        this.number = number;
        this.name = name;
        this.pay = pay;
    }
}
