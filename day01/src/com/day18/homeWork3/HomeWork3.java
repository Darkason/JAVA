package com.day18.homeWork3;

public class HomeWork3 {
    static int sell = 0;
    static int count = 100;

    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    if (count <= 0) {
                        System.out.println("杯子卖完了");
                        break;
                    }
                    sell++;
                    count--;
                    System.out.println(Thread.currentThread().getName() + "卖出第 " + sell + " 个，总共剩下 " + count + " 个");
                }
            }
        }, "实体店").start();
        new Thread(() -> {
            while (true) {
                synchronized (obj) {
                    if (count <= 0) {
                        System.out.println("杯子卖完了");
                        break;
                    }
                    sell++;
                    count--;
                    System.out.println(Thread.currentThread().getName() + "卖出第 " + sell + " 个，总共剩下 " + count + " 个");
                }
            }
        }, "官网").start();
    }
}
