package com.day17;

import org.junit.*;

public class Demo {
    @BeforeClass
    public static void myStartBefore() {
        System.out.println("Start");
    }

    @Before
    public void myBefore() {
        System.out.println("Before");
    }

    @Test
    public void a() {
        System.out.println("now"  );
    }

    @After
    public void myAfter() {
        System.out.println("After");
    }

    @AfterClass
    public static void myEndAfter() {
        System.out.println("End");
    }
}
