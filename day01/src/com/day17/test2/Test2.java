package com.day17.test2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 {
    public static void main(String[] args) throws Exception {
        b();
        a();
    }

    public static void a() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\d.txt"));
        User user = (User) ois.readObject();
        System.out.println(user);
        ois.close();
    }

    public static void b() throws Exception {
        User user = new User(2, "蒂福斯基", 34);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\d.txt"));
        oos.writeObject(user);
        oos.flush();
        oos.close();
    }
}
