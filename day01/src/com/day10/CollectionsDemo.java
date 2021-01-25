package com.day10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(12);
        list.add(14);
        list.add(15);
        list.add(100);
        list.add(16);

        //比较器
//        Comparator<Integer> comparator=new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                //降序
////                return o2-o1;
//                //升序
//                return o1-o2;
//            }
//        };
//        Collections.sort(list,comparator);

        Collections.sort(list, (a, b) -> {
            return b - a;
        });

        System.out.println("排序后：" + list);
    }
}