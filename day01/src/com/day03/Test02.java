package com.day03;

//计算数组中的最大值
public class Test02 {
    public static void main(String[] args) {
        int[] arr = {231, 1, 2, 3, 4, 5, 5364, 2134};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
