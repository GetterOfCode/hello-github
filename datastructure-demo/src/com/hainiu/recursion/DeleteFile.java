package com.hainiu.recursion;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\15519\\Desktop\\atest");
        deleteFile(file);

    }
    private static void deleteFile(File file) {
        if (!file.exists()) {
            return;
        }
        if(file.isFile()){
            file.delete();
            return;
        }
        File[] files = file.listFiles();
        if (files!=null){
            for (File file1 : files) {
                if (file1.isFile()){
                    file1.delete();
                }
                deleteFile(file1);
            }
        }
        file.delete();


    }
}
