package com.day18.homeWork6;

public class HomeWork6 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread thread = new Thread(bank);
        Thread thread1 = new Thread(bank);
        thread.start();
        thread1.start();
    }
}
