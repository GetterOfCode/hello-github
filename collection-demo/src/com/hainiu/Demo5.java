package com.hainiu;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo5 {
    public static void main(String[] args) {
        // 通过键找值
        HashMap<String, String> map = new HashMap<String, String>();


        map.put("许仙", "白娘子");
        map.put("牛郎", "织女");
        map.put("梁山伯", "祝英台");
        map.put("范喜良", "孟姜女");
        map.put("罗密欧","朱丽叶");
        //foreach
        map.forEach((k,v) ->System.out.println(k+"和"+v));
        Set<Map.Entry<String, String>> entries = map.entrySet();
//        entries.forEach(stringStringEntry -> System.out.println(stringStringEntry));
        for (Map.Entry<String, String> entry : entries) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("----------");

        Set<String> strings = map.keySet();
        for (String string : strings) {
            System.out.println(string+"=="+map.get(string));
        }
    }

}
