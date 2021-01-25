package com.day09.question;

public class HomeWork6 {
    public static void main(String[] args) {
        String s = "javajfifiewjavajfifiowfjavagkljjava213java";
        int count = getCount(s,"java");
        System.out.println(count);
    }
    public static int getCount(String str,String ch){
        int count = 0;
        while (str.indexOf(ch)!=-1){
            int index = str.indexOf(ch);
            str = str.substring(index+ch.length());
            count++;
        }
        return count;
    }
}
