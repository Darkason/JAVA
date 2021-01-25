package com.day18.homeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        Cave cave = new Cave();
        Thread thread = new Thread(cave);
        Thread thread2 = new Thread(cave);
        Thread thread3 = new Thread(cave);
        Thread thread4 = new Thread(cave);
        Thread thread5 = new Thread(cave);
        Thread thread6 = new Thread(cave);
        Thread thread7 = new Thread(cave);
        Thread thread8 = new Thread(cave);
        Thread thread9 = new Thread(cave);
        Thread thread10 = new Thread(cave);
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        thread9.start();
        thread10.start();
    }
}
