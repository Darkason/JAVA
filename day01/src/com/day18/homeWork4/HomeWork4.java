package com.day18.homeWork4;

public class HomeWork4 {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Thread thread = new Thread(bus, "前门");
        Thread thread2 = new Thread(bus, "中门");
        Thread thread3 = new Thread(bus, "后门");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
