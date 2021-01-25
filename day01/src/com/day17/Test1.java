package com.day17;

import java.io.*;

public class Test1 {
    public static void main(String[] args) throws Exception {
        a();
    }

    public static void a() throws Exception {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\b.txt"), "GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\c.txt"));
        char[] c = new char[10];
        int len;
        while ((len = isr.read(c)) != -1) {
            osw.write(c, 0, len);
        }
        osw.flush();
        osw.close();
        isr.close();
    }
}
