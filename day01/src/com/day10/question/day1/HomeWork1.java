package com.day10.question.day1;

import java.util.ArrayList;
//有一个数组 String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};创建一个ArrayList，将数组里面的元
//素添加进 ArrayList，但元素不能重复(不能使用HashSet去除重复元素)
public class HomeWork1 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi","cef"};
        ArrayList<String> arrayList = new ArrayList();
        for (int i = 0; i < arr.length; i++) {
            if (arrayList.contains(arr[i])) {
                continue;
            }
            arrayList.add(arr[i]);
        }
        for (String str: arrayList){
            System.out.println(str);
        }
    }
}
