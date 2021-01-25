package com.day10;

import java.util.ArrayList;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> collection = new ArrayList();
        collection.add("Whison");
        collection.add("House");
        collection.add("Wwqsad");
        collection.add("Qdsad");
        collection.add("Hrte");
        collection.add(1,"Howqee");
        collection.add("Houe");
        collection.remove("house");
        collection.remove(2);
        System.out.println(collection);
//        for (String str : collection) {
//            System.out.println(str);
//        }
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.get(i));
        }
    }
}
