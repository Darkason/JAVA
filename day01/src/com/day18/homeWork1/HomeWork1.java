package com.day18.homeWork1;

public class HomeWork1 {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronized (obj) {
                    System.out.println("团战可以输");
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                synchronized (obj) {
                    System.out.println("霞必须死");
                }
            }
        }).start();
    }
}
