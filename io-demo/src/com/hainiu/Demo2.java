package com.hainiu;
import java.io.*;

public class Demo2 {
    public static void main(String[] args) throws Exception {
//        FileWriter fw = new FileWriter("io-demo\\a.txt");
//        fw.write("hello world 中国");
//        fw.close();
//        FileReader fr = new FileReader("io-demo\\a.txt");
//        int len = 0;
//        while((len = fr.read())!= -1){
//
//            System.out.println((char) len);
//        }

//        char[] buf = new char[1024];
//        int len = 0;
//        while((len = fr.read(buf))!= -1){
//            String s = new String(buf, 0,len);
//            System.out.println(s);
//        }

//        fr.close();
//        BufferedReader br = new BufferedReader(fr);
//
//        String line = null;
//        while((line = br.readLine())!=null){
//            System.out.println(line);
//        }
//
//
//        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("io-demo\\b.txt"));
        bw.write("hello");
        bw.write("hello");
        bw.write("hello");
        bw.write("hello");
        bw.newLine();
        bw.write("world");
        bw.write("world");
        bw.write("world");
        bw.write("world");
        bw.close();


    }
}
