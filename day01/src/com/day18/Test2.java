package com.day18;

public class Test2 {
    public static void main(String[] args) {
        Tickets tickets = new Tickets();
        Thread thread = new Thread(tickets,"窗口一：");
        Thread thread2 = new Thread(tickets,"窗口二：");
        Thread thread3 = new Thread(tickets,"窗口三：");
        thread.start();
        thread2.start();
        thread3.start();
    }
}
