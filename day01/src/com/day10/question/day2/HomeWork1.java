package com.day10.question.day2;

import java.util.*;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入（格式：编号，水果）：");
        String string = scanner.nextLine();
        String[] s = string.split(",|，");
        HashMap<String,String> fruitMap = new HashMap<>();
        for (int i = 0; i < s.length; i+=2) {
            fruitMap.put(s[i],s[i+1]);
        }
        System.out.println("请输入查询商品编号：");
        String number = scanner.next();
//        fruitMap.get(number);
        System.out.println(fruitMap.get(number));
    }
}
