package com.day10.question.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
//键盘录入一个字符串.去掉其中重复字符, 打印出不同的那些字符.必须保证顺序.例如输入:aaaabbbcccddd,打印结
//果为：abcd
public class HomeWork2 {
    public static void main(String[] args) {
//        创建Scanner对象,用于键盘录入
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
//        将字符串串转成char[]
        char[] chars = string.toCharArray();
        ArrayList<String> arrayList = new ArrayList();
        HashSet<String> hashSet = new HashSet();
        for (char str : chars) {
            hashSet.add(String.valueOf(str));
        }
//        System.out.println(hashSet);
        for (String str1 : hashSet) {
            arrayList.add(str1);
        }
//        System.out.println(arrayList);
        for (String str2 : arrayList) {
            System.out.println(str2 + " ");
        }
    }
}
