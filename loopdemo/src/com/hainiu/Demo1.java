package com.hainiu;

public class Demo1 {
    public static void main(String[] args) {

        int max = max(1, 2, 3);
        System.out.println(max);
    }
    private static int max(int numb1,int numb2, int numb3) {
        return numb1>numb2?numb1>numb3?numb1:numb3:numb2>numb3?numb2:numb3;
    }
}
