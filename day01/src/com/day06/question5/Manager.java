package com.day06.question5;

public class Manager extends Worker{
    @Override
    public void eat() {
        System.out.println("工号为;" + number + ",姓名为：" + name + "工资为:" + pay + "的经理在吃鱼");
    }
    @Override
    public void work() {
        System.out.println("工号为;"+number+",姓名为："+name+"工资为:"+pay+"的经理在工作，管理其他人");
    }

    public Manager() {
    }

    public Manager(String number, String name, int pay) {
        super(number, name, pay);
    }
}
