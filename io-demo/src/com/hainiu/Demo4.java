package com.hainiu;

import java.util.Enumeration;
import java.util.Properties;

public class Demo4 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("name","zs");
        properties.setProperty("age","18");
        properties.setProperty("salary","100000");
        properties.forEach((k,v)-> System.out.println(k+":"+v));
//        Enumeration<?> enumeration = properties.propertyNames();
//        while(enumeration.hasMoreElements()){
//            String key = (String) enumeration.nextElement();
//            String value = (String) properties.getProperty(key);
//            System.out.println(key+":"+value);
//        }

    }
}
