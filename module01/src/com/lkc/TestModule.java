package com.lkc;

import java.util.ArrayList;
import java.util.Date;
//这是单行注释
public class TestModule {
    public static void main(String[] args) {
        System.out.println("Hello Idea Module");
        Date date = new Date();
        method();
    }

    public static void method() {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1");
        arrayList.add("2");
        for (String value : arrayList) {
            System.out.println(value);
        }
        System.out.println("666");
        System.out.println("111");
    }
}
