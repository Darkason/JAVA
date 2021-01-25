package com.day05;

import java.util.Scanner;

public class User {
    String userName;
    int score;

    public int userChuQuan() {
        System.out.println("游戏开始了，出招吧。1.石头，2.剪刀，3.布（不会有人不按数字出拳吧）：");
        Scanner scanner = new Scanner(System.in);
        int userChu = scanner.nextInt();
        switch (userChu) {
            case 1:
                System.out.println(userName + "出了石头");
                break;
            case 2:
                System.out.println(userName + "出了剪刀");
                break;
            case 3:
                System.out.println(userName + "出了布");
                break;
            default:
                System.out.println("大家快来看，" + userName + "连数字都不认识");
                break;
        }
        return userChu;
    }
}
