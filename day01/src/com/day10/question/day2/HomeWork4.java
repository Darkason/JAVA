package com.day10.question.day2;

import java.util.HashMap;
import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入：");
        String str = scanner.nextLine();
        HashMap<String, Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            //判断是不是空格
            if (Character.isSpaceChar(c)) {
                countingKey(hashMap, "空格");
            }
            else if (Character.isLowerCase(c) || Character.isUpperCase(c)) {
                countingKey(hashMap, "字母");
            }
            else if (Character.isDigit(c)) {
                countingKey(hashMap, "数字");
            } else {
                countingKey(hashMap, "其他");
            }
        }
        System.out.println(hashMap);
    }

    public static void countingKey(HashMap map, String key) {
        if (map.containsKey(key)) {
            Integer count = (Integer) map.get(key);
            map.put(key, ++count);
        } else {
            map.put(key, 1);
        }
//        System.out.println(map);
    }
}
