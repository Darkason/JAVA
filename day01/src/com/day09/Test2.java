package com.day09;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入");
            String str = scanner.next();
            if (str.equals("end")) {
                System.out.println("Game over");
                break;
            }
            System.out.println("输入的值：" + str);
        }
    }
}
