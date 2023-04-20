package com.hainiu;

import java.util.HashMap;

public class Demo6 {
    public static void main(String[] args) {
        HashMap<String,Integer> stringIntegerHashMap = new HashMap<String,Integer>();
        String str = "hello java world java world world world world python C++ javase javase";
        String[] split = str.split("\\s+");
        for (String s : split) {
            stringIntegerHashMap.put(s,stringIntegerHashMap.containsKey(s)?stringIntegerHashMap.get(s)+1:1);
        }
        stringIntegerHashMap.forEach((k,v) -> System.out.println(k+"="+v));
    }
}
