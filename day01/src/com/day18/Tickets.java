package com.day18;

public class Tickets implements Runnable {
    int num = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (num <= 0) {
                    System.out.println("票买完了");
                    break;
                }
                System.out.println("卖票：" + Thread.currentThread().getName() + ",票号：" + num);
                num--;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
