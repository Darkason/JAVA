package com.day18.homeWork6;

public class Bank implements Runnable {
    int monry = 0;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            monry += 100;
            System.out.println(Thread.currentThread().getName() + "  " + monry);
        }
    }
}
