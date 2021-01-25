package com.day03;
import java.util.Arrays;

public class Test01 {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2=new int[5];
        //复制值
        System.arraycopy(arr1,0,arr2,1,2);
        arr2[0]=100;
        //发现arr1[0]的值还是1，不是100
        System.out.println(arr1[0]);
        System.out.println(Arrays.toString(arr2));

        //复制地址
        int[] arr3=arr1;
        arr3[0]=100;
        //发现arr1[0]的值是100，不是1
        System.out.println(arr1[0]);
        System.out.println(Arrays.toString(arr3));
    }
}
