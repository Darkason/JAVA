package com.day18;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo {
    public static void main(String[] args) throws Exception {
//        Thread thread = new Thread() {
//            @Override
//            public void run() {
//                System.out.println("123");
//            }
//        };
//        thread.start();
//
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hello");
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//        Thread thread1 = new Thread(runnable, "线程1：");
//        thread1.start();
//
//        Callable callable = new Callable() {
//            @Override
//            public Object call() throws Exception {
//                return "world";
//            }
//        };
//        FutureTask futureTask = new FutureTask(callable);
//        Thread thread2 = new Thread(futureTask);
//        thread2.start();
//        System.out.println(futureTask.get());

        new Thread(()->{
            System.out.println(Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getName());
        }).start();

        new Thread(new FutureTask<String>(()->{
            System.out.println(Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getName());
            return "HelloWorld";
        }),"线程test").start();
    }
}
