package com.day10.question.day1.homework5;

import com.day07.question1.A;

import java.util.*;

public class HomeWork5 {
    public static void main(String[] args) {
        Person p0 = new Person("张三", 23, 1000d);
        Person p1 = new Person("李四", 24, 996d);
        Person p2 = new Person("王五", 25, 211d);
        Person p3 = new Person("赵六", 26, 985d);
        Person p4 = new Person("赵四", 24, 250d);
        Person p5 = new Person("小万", 27, 10000d);
        Person p6 = new Person("小王", 23, 1001d);
        Person p7 = new Person("老王", 30, 20000d);
        Person p8 = new Person("赵四", 24, 100000d);
        Person p9 = new Person("张三", 23, 9982d);
        ArrayList<Person> arrayList = new ArrayList();
        arrayList.add(p0);
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        arrayList.add(p5);
        arrayList.add(p6);
        arrayList.add(p7);
        arrayList.add(p8);
        arrayList.add(p9);
        Collections.sort(arrayList);
        double maxPay = arrayList.get(0).getPay();
        double minPay = arrayList.get(0).getPay() ;
        double averPay = 0;
        int count = 0;
        for (Person person : arrayList) {
            System.out.println(person);
            averPay += person.getPay();
//            averPay = averPay / arrayList.size();
            if (person.getPay() > maxPay) {
                maxPay = person.getPay();
            }
            if (person.getPay() < minPay) {
                minPay = person.getPay();
            }
            if (averPay/arrayList.size() < person.getPay()) {
                count++;
            }
        }
        System.out.println("最高工资：" + maxPay);
        System.out.println("最低工资：" + minPay);
        System.out.println("平均工资：" + averPay/arrayList.size());
        System.out.println("高于平均工资的人数：" + count);
        HashSet<Person> hashSet = new HashSet<>();
        hashSet.addAll(arrayList);
        for (Person person:hashSet){
            System.out.println(person);
        }
    }
}
