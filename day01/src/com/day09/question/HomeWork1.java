package com.day09.question;

import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Import The First Number");
        Integer a = scanner.nextInt();
        System.out.println("Please Import The Second Number");
        Integer b = scanner.nextInt();
        System.out.println("Please Import The Third Number");
        Integer c = scanner.nextInt();
        Integer temp = (a > b ? a : b);
        Integer max = (temp > c ? temp : c);
        System.out.println("Max:"+max);
    }
}
