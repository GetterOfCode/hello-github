package com.hainiu;

//import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);


        Integer[] integers = list.toArray(new Integer[2]);
//        for (Object object : objects) {
//            System.out.println(object);
//        }

        for (Integer integer : integers) {
            System.out.println(integer);

        }
    }
}
