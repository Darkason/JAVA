package com.day18.homeWork2;

public class Cave implements Runnable{
    Object object = new Object();
    @Override
    public void run() {
//        for (int i = 0; i < 10; i++) {
            synchronized (object){
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
//}
