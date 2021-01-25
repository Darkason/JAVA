package com.day10.question.day1;

import java.util.ArrayList;
import java.util.Random;

//   双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。红色球号码从1—33中选择；蓝色球号
//   码从1—16中选择.请随机生成一注双色球号码，例如 红1蓝2
public class HomeWork4 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList arrayList = new ArrayList();
        int blue = random.nextInt(16) + 1;
        for (int i = 0; i < 6; i++) {
            Integer red = random.nextInt(33) + 1;
            arrayList.add("red(" + red + ")");
        }
        arrayList.add("blue(" + blue + ")");
        for (Object object : arrayList) {
            System.out.print(object + " ");
        }
    }
}
