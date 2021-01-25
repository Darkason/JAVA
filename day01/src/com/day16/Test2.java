package com.day16;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        String str = "abc";
        fos.write('a');
        fos.write(97);
        fos.write(str.getBytes());
        fos.close();
        FileOutputStream fos1 = new FileOutputStream("D:\\b.txt",true);
        fos1.write("撒旦".getBytes());
        fos1.close();
    }
}
