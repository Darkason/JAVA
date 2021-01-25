package com.day10.question.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class HomeWork6 {
    public static void main(String[] args) {
        HashMap<Integer, String> cardMap = new HashMap<>();
        ArrayList<String> types = new ArrayList<>();
        ArrayList<String> number = new ArrayList<>();
        ArrayList<String> wind = new ArrayList<>();
        Collections.addAll(types, "万", "筒", "条");
        Collections.addAll(number, "一", "二", "三", "四", "五", "六", "七", "八", "九");
        Collections.addAll(wind, "东", "南", "西", "北", "中", "發", "口");
        int count = 1;
        for (String str : types) {
            for (String s : number) {
                for (int i = 0; i < 4; i++) {
                    cardMap.put(count++, s + str);
                }
            }
        }
        for (String str : wind) {
            for (int i = 0; i < 4; i++) {
                cardMap.put(count++, str);
            }
        }
//        System.out.println(cardMap);
        Set<Integer> keySet = cardMap.keySet();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(keySet);
        Collections.shuffle(numbers);
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> p4 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (i < 48) {
                if (i / 4 % 4 == 0) {
                    p1.add(numbers.get(i));
                } else if (i / 4 % 4 == 1) {
                    p2.add(numbers.get(i));
                } else if (i / 4 % 4 == 2) {
                    p3.add(numbers.get(i));
                } else if (i / 4 % 4 == 3) {
                    p4.add(numbers.get(i));
                }
            }
            else if (i == 48) {
                p1.add(numbers.get(i));
            }
            else if (i == 49) {
                p2.add(numbers.get(i));
            }
            else if (i == 50) {
                p3.add(numbers.get(i));
            }
            else if (i == 51) {
                p4.add(numbers.get(i));
            } else {
                diPai.add(numbers.get(i));
            }
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(p4);
        Collections.sort(diPai);
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> play4 = new ArrayList<>();
        ArrayList<String> diPaiList = new ArrayList<>();
        for (Integer i:p1){
            String string = cardMap.get(i);
            play1.add(string);
        }
        for (Integer i:p2){
            String string = cardMap.get(i);
            play2.add(string);
        }
        for (Integer i:p3){
            String string = cardMap.get(i);
            play3.add(string);
        }
        for (Integer i:p4){
            String string = cardMap.get(i);
            play4.add(string);
        }
        for (Integer i:diPai){
            String string = cardMap.get(i);
            diPaiList.add(string);
        }
        System.out.println("西门庆：" + play1);
        System.out.println("潘金莲：" + play2);
        System.out.println("大郎：" + play3);
        System.out.println("武松：" + play4);
        System.out.println("底牌：" + diPaiList);
    }
}
