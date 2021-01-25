package com.day06.question5;

public class Cooker extends Worker {
    @Override
    public void eat() {
        System.out.println("工号为;" + number + ",姓名为：" + name + "工资为:" + pay + "的厨师在吃肉");
    }

    @Override
    public void work() {
        System.out.println("工号为;" + number + ",姓名为：" + name + "工资为:" + pay + "的厨师在工作，炒菜");
    }

    public Cooker() {
    }

    public Cooker(String number, String name, int pay) {
        super(number, name, pay);
    }
}
