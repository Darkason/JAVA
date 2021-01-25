package com.day09.question;

import java.util.Scanner;

public class HomeWork5 {
    public static void main(String[] args) {
        String mgc = "奥巴马";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String a = scanner.nextLine();
        System.out.println(a.replace(mgc,"**"));
    }
}
