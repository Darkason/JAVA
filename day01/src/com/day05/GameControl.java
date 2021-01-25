package com.day05;

import java.util.Scanner;

public class GameControl {
    Scanner scanner = new Scanner(System.in);
    //    初始化电脑对象
    Computer computer = new Computer();
    //    初始化玩家对象
    User user = new User();
    //    定义游戏局数
    int count;
    //    定义游戏分数
    int sorce;

    public void initial() {
//                初始化分数
        computer.score = 0;
        user.score = 0;
    }

    public void GameStart() {
        System.out.println("------又来到了一年一度的拳王争霸赛------");
        System.out.println("请选着对方角色(1:第一届拳王牛皮大王 2:第三届拳王爱德华剪刀手 3:第五届拳王嘴遁王者chen)");
        int choose = scanner.nextInt();//接收用户选择的角色
        switch (choose) {
            case 1:
                computer.computerName = "第一届拳王牛皮大王";//把值赋给电脑类的name
                System.out.println("你选择了" + computer.computerName + "对战");
                break;
            case 2:
                computer.computerName = "第三届拳王爱德华剪刀手";
                System.out.println("你选择了" + computer.computerName + "对战");
                break;
            case 3:
                computer.computerName = "第五届拳王嘴遁王者chen";
                System.out.println("你选择了" + computer.computerName + "对战");
                break;
            default:
                System.out.println("输入有误！");
                return;
        }
        System.out.println("请输入你的姓名：");
        user.userName = scanner.next();
        System.out.println("准备好了吗？Y/N");
        String begin = scanner.next();
        if (begin.equals("N")) {
            System.out.println("还没开始就跑了。。。。");
        }
        if (begin.equals("Y")) {
            int userChoice;
            int comChoice;
            while (begin.equals("Y")) {
                System.out.println("出拳规则：1.石头 2.剪刀 3.布");
                userChoice = user.userChuQuan();
                comChoice = computer.chuQuan();
                if (userChoice == comChoice) {
                    System.out.println("平局，皆大欢喜");
                    user.score += 1;
                    computer.score += 1;
//                    System.out.println(user.score);
//                    System.out.println(computer.score);
                } else if (userChoice == 1 && comChoice == 2 || userChoice == 2 && comChoice == 3 || userChoice == 3 && comChoice == 1) {
                    System.out.println("小伙子可以啊,再接再厉");
                    user.score += 3;
                    computer.score -= 3;
//                    System.out.println(user.score);
//                    System.out.println(computer.score);
                } else {
                    System.out.println("果然还是差点火候");
                    computer.score += 3;
                    user.score -= 3;
//                    System.out.println(user.score);

//                    System.out.println(computer.score);
                }
                count++;
                System.out.println("不要走，决战到天亮！！（Y/N）");
                begin = scanner.next();
            }
            showResult();
        } else return;
    }

    public void showResult() {
        System.out.println("------------------------------------------------");
        System.out.println(computer.computerName + "\tVS\t" + user.userName);
        System.out.println("对战次数：" + count);
        System.out.println("姓名" + "\t" + "积分");
        System.out.println(user.userName + "\t" + user.score);
        System.out.println(computer.computerName + "\t" + computer.score);
        if (user.score > computer.score) {//如果用户的分数大于电脑的分数 则用户赢
            System.out.println("本届大赛结束:" + user.userName + "赢了！");
        } else if (user.score == computer.score) {
            System.out.println("本届大赛结束，势均力敌");
        } else {
            System.out.println("本届大赛结束:" + computer.computerName + "赢了！");
        }
        System.out.println("-------------------------------------------------");
    }
}
