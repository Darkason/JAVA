package com.day07.question2;

public class NewPhone extends Phone implements Play{
    @Override
    public void playGame() {
        System.out.println("新手机玩游戏");
    }

    @Override
    public void call() {
        System.out.println("新手机打电话");
    }

    @Override
    void sendMessages() {
        System.out.println("新手机发短信");
    }
}
