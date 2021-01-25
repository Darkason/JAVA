package com.day16.homework;

import java.io.File;
import java.io.FileInputStream;

//在d盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
//定义一个方法统计test.txt文件中指定字符出现的次数。
// 比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
public class HomeWork3 {
    public static void main(String[] args) throws Exception{
        FileInputStream fis = new FileInputStream("D:\\a.txt");
    }
}
