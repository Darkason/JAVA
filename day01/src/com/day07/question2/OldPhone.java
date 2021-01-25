package com.day07.question2;

public class OldPhone extends Phone{
    @Override
    public void call() {
        System.out.println("旧手机打电话");
    }

    @Override
    void sendMessages() {
        System.out.println("旧手机发短信");
    }
}
