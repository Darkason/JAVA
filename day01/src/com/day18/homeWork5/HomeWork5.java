package com.day18.homeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
        new Thread(() -> {
            int num = 1;
            for (int i = 1; i <= 10; i++) {
                num = i * num;
            }
            System.out.println(num);
        }).start();
        new Thread(() -> {
            int num = 1;
            for (int i = 1; i <= 8; i++) {
                num = i * num;
            }
            System.out.println(num);
        }).start();
        new Thread(() -> {
            int num = 1;
            for (int i = 1; i <= 5; i++) {
                num = i * num;
            }
            System.out.println(num);
        }).start();
    }
}
