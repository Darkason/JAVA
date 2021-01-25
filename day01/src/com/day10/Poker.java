package com.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

public class Poker {
    public static void main(String[] args) {
        HashMap<Integer, String> pokerMap = new HashMap<>();
        ArrayList<String> numbers = new ArrayList();
        ArrayList<String> colors = new ArrayList();
        Collections.addAll(colors, "♦", "♣", "♥", "♠");
        Collections.addAll(numbers, "2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        int count = 1;
        pokerMap.put(count++, "RED JOKER");
        pokerMap.put(count++, "BLACK JOKER");
        for (String number : numbers) {
            for (String color : colors) {
                pokerMap.put(count++, color + number);
            }
        }
//        System.out.println(pokerMap);
        Set<Integer> numberSet = pokerMap.keySet();
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.addAll(numberSet);
        Collections.shuffle(numberList);
        ArrayList<Integer> noP1 = new ArrayList();
        ArrayList<Integer> noP2 = new ArrayList();
        ArrayList<Integer> noP3 = new ArrayList();
        ArrayList<Integer> noDipai = new ArrayList();
        for (int i = 0; i < numberList.size(); i++) {
            Integer no = numberList.get(i);
            if (i > 50) {
                noDipai.add(no);
            } else {
                if (i % 3 == 0) {
                    noP1.add(no);
                } else if (i % 3 == 1) {
                    noP2.add(no);
                } else {
                    noP3.add(no);
                }
            }
        }
        Collections.sort(noDipai);
        Collections.sort(noP1);
        Collections.sort(noP2);
        Collections.sort(noP3);
//        System.out.println(noDipai);
//        System.out.println(noP1);
//        System.out.println(noP2);
//        System.out.println(noP3);
        ArrayList<String> play1 = new ArrayList<>();
        ArrayList<String> play2 = new ArrayList<>();
        ArrayList<String> play3 = new ArrayList<>();
        ArrayList<String> diPai = new ArrayList<>();
        for (Integer i : noDipai) {
            String card = pokerMap.get(i);
            diPai.add(card);
        }
        for (Integer i : noP1) {
            String card = pokerMap.get(i);
            play1.add(card);
        }
        for (Integer i : noP2) {
            String card = pokerMap.get(i);
            play2.add(card);
        }
        for (Integer i : noP3) {
            String card = pokerMap.get(i);
            play3.add(card);
        }
        System.out.println("令狐冲："+play1);
        System.out.println("石破天："+play2);
        System.out.println("鸠摩智："+play3);
        System.out.println("底牌："+diPai);
    }
}
