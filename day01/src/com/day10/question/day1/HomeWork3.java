package com.day10.question.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//有2个ArrayList,元素如下: array1 = "a","b","a","c","d",array2= "e","f","a","d","g",将两个集合重复项去除后合并成一个集合
public class HomeWork3 {
    public static void main(String[] args) {
        ArrayList<String> array1 = new ArrayList();
        array1.add("a");
        array1.add("b");
        array1.add("a");
        array1.add("c");
        array1.add("d");
        ArrayList<String> array2 = new ArrayList();
        array2.add("e");
        array2.add("f");
        array2.add("a");
        array2.add("d");
        array2.add("g");
        HashSet hashSet = new HashSet();
        for (String str:array1){
            hashSet.add(str);
        }
        for (String str:array2){
            hashSet.add(str);
        }
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();
            System.out.print(string);
        }
    }
}
