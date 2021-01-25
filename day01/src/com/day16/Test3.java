package com.day16;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\b.txt");
        FileInputStream fis = new FileInputStream(file);
        byte[] bytes = new byte[1024 * 1];
        int len;
        while (true) {
            len = fis.read(bytes);
            if (len == -1) {
                break;
            }
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
    }
}
