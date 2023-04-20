package com.hainiu.recursion;

import java.io.File;

public class SizeOfFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\15519\\Desktop\\atest");
        System.out.println(sizeOfFile(file));

    }
    private static long sizeOfFile(File file) {
        if (!file.exists()) {
            return 0;
        }
        if(file.isFile()){

            return file.length();
        }
        long sum = 0;
        File[] files = file.listFiles();
        if (files!=null){
            for (File file1 : files) {
                sum = sum + sizeOfFile(file1);
            }
        }
       return sum;


    }
}
