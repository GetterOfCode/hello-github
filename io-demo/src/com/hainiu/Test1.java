package com.hainiu;

import java.io.File;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File testFile = new File("C:\\Users\\15519\\Desktop\\test\\test1\\txt.txt");
//        testFile.createNewFile();
//        testFile.mkdir();
        testFile.createNewFile();

        boolean file = testFile.isFile();
        System.out.println(file);

    }
}
