package com.hainiu.demo1;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Demo14 {
    public static void main(String[] args) throws Exception{
        ArrayList<String> arrs = new ArrayList<>();
        arrs.add("hello");
        arrs.add("world");
        arrs.add("java");
        Class clazz = arrs.getClass();
        Method add = clazz.getMethod("add", Object.class);
        add.invoke(arrs, 10);
        add.invoke(arrs, new Student("倪晨晨",18));

        for (Object arr : arrs) {
            System.out.println(arr);

        }

    }
}
