package com.hainiu;

import java.util.LinkedList;

/**
 * LinkedList 1-108号 排序拿好，拿起一张扔掉，拿起一张放到最下面。反复操作，直到剩余一张，剩的谁？
 */
public class Demo2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= 108; i++) {
            list.add(i);
        }
//        list.forEach(System.out::println);//测试输出一下
        while (list.size()!=1) {
            list.removeFirst();
            list.addLast(list.removeFirst());
        }
        //输出list中剩余的元素
        list.forEach(System.out::println);
    }
}
