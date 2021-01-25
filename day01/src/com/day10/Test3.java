package com.day10;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet();
        hashSet.add("潘经理");
        hashSet.add("老油条");
        hashSet.add("山大倒萨");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
    }
}
