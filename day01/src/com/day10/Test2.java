package com.day10;

import java.util.ArrayList;
import java.util.LinkedList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList();
        collection.add("qwe");
        collection.add("qwe");
        collection.add("qwe");
        collection.add("qwe");
        LinkedList<String> collection1 = new LinkedList();
        collection1.add("wqes");
        collection1.add("wqes");
        collection1.add("wqes");
        collection1.add("wqes");

        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            collection1.add(1,"times");
        }
        long endTime1 = System.currentTimeMillis();

        long startTime = System.currentTimeMillis();

        for (long i = 0; i < 1000000; i++) {
            collection.add(1,"times");
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println(time);


        long time1 = endTime1 - startTime1;
        System.out.println(time1);
    }
}
