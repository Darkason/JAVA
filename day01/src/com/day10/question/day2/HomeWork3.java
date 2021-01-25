package com.day10.question.day2;

import java.util.HashMap;
import java.util.Scanner;

public class HomeWork3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] chars = string.toCharArray();
        HashMap<String, Integer> hashMap = new HashMap<>();
//        int count = 1;
        System.out.println(chars);
        for (char c : chars) {
//            hashMap.put((c + ""), count);
//            if (hashMap.containsKey(c+"")) {
//                count++;
//            }
            if (hashMap.containsKey(c+"")){
                int count = hashMap.get(c+"");
                hashMap.put(c+"",count+1);
            }else{
                hashMap.put(c+"",1);
            }
        }
        hashMap.remove(" ");
        System.out.println(hashMap);
    }
}
