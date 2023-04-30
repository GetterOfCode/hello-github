package com.hainiu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 定义ArrayList集合，随意存储几个字符串，并遍历（三种：迭代器 foreach 索引）
 */
public class Demo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("C++");
        list.add("golang");
        //增强for
        for (String s : list) {
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        //迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
        System.out.println("--------------------------------");
        //foreach
        list.forEach(System.out::print);
        System.out.println();
        System.out.println("----------------------------------");
        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
