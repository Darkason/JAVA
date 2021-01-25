package com.day18.homeWork4;

public class Bus implements Runnable {
    //    int num = 0;
    int count = 80;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (count <= 0) {
                    System.out.println("车满了");
                    break;
                }
                count--;
                System.out.println(Thread.currentThread().getName() + "上车，还剩 " + count + " 个座位");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
