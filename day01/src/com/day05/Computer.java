package com.day05;

public class Computer {
    String computerName;
    int score;

    public int chuQuan() {
        int random = (int) (Math.random() * 3) + 1;
        switch (random) {
            case 1:
                System.out.println(computerName + "出拳：石头");
                break;
            case 2:
                System.out.println(computerName + "出拳：剪刀");
                break;
            case 3:
                System.out.println(computerName + "出拳：布");
                break;
            default:
                System.out.println("输入有误，请重新输入：");
                break;
        }
        return random;
    }
}
