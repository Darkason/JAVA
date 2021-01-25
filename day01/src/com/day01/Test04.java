package com.day01;

import java.util.Scanner;

//打印菱形
public class Test04 {
    public static void main(String[] args) {
        Scanner line = new Scanner(System.in);
        int lines = line.nextInt();
        if (lines % 2 == 1) {
            prismatic(lines);
        } else
            System.out.println("不能输入偶数");
    }

    public static void prismatic(int lines) {
        int num;
        int a;
        for (int i = 1; i <= lines; i++) {
            num = Math.abs(lines - (i * 2 - 1)) / 2;
            a = (lines - 1) / 2 + 1;
//            int b = a - 1;
            for (int j = 1; j <= num; j++) {
                System.out.print(" ");
            }
            if (i <= a) {
                for (int j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j <= 2 * (lines - i) + 1; j++) {
                    System.out.print("*");
                }
            }
            for (int j = 1; j <= num; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
