package com.hainiu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo5 {
    public static void main(String[] args) throws IOException {
//        FileInputStream fis = new FileInputStream("io-demo\\pro.properties");
//        Properties props = new Properties();
//        props.load(fis);
//        fis.close();
//        props.forEach((k,v)-> System.out.println(k+"="+v)) ;
        Properties props = new Properties();
        props.setProperty("name","zhangsan");
        props.setProperty("age","25");
        props.setProperty("adress","peking");
        props.setProperty("height","182");
        FileOutputStream fos = new FileOutputStream("io-demo\\newpro.properties");
        props.store(fos, "hhhhhh");
        fos.close();


    }
}
