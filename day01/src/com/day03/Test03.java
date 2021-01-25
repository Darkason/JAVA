package com.day03;

import java.util.Arrays;

//对数组进行排序
public class Test03 {
    /*    使用sort方法，默认升序
        public static void main(String[] args) {
            int[] arr = {1, 4, 2, 4, -1, 52, 34};
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }*/
    //sort方法中指定位置开始和结束
/*    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, -1, 52, 34};
        Arrays.sort(arr,0,7);//不包括toIndex
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }*/

    //冒泡排序法
    public static void main(String[] args) {
        int[] arr = {1, 22, 5, 65, -1, 63, 6};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
