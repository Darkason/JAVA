package com.day16;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("D:\\1.gif");
            String path = "D:\\" + System.currentTimeMillis() + ".gif";
            fos = new FileOutputStream(path);
            byte[] bytes = new byte[64];
            while (true){
                int len = fis.read(bytes);
                if (len == -1){
                    break;
                }
                fos.write(bytes,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
