package com.day16;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test5 {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("D:\\a.txt");
        int len;
        while ((len = fr.read())!= -1){
            System.out.print((char) len);
        }
        fr.close();

        FileWriter fw = new FileWriter("D:\\b.txt");
        fw.write("一刀9999");
        fw.flush();
        fw.close();

        FileReader fr1 = null;
        FileWriter fw1 = null;
        try {
            fr1 = new FileReader("D:\\Typora.zip");
            fw1 = new FileWriter("D:\\newTypora.zip");

            int len1;
            char[] c = new char[1024];
            while (true) {
                len1 = fr1.read(c);
                if (len1 == -1) {
                    break;
                }
                fw1.write(c, 0, len1);
                fw1.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw1 != null) {
                    fw1.close();
                }
                if (fr1 != null) {
                    fr1.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
