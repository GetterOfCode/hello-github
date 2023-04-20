package com.hainiu;

import java.util.ArrayList;
import java.util.List;

public class Demo3 {
    public static void main(String[] args) {
        List<Integer> integers = searchDafNumbers(100000);
        System.out.println(integers);

    }
    //水仙花功能拓展 n位数number == 各个数字的n次方之和
    private static List<Integer> searchDafNumbers(int max){
        int i = 1;
        List<Integer> result = new ArrayList<Integer>();
        while (i<max) {
            int length= String.valueOf(i).length();
            int sum = 0;
            int temp = i;
            for(int j=0; j<length; j++){
                sum += Math.pow(temp%10,length);
                temp =temp/10;
            }
            if (sum == i){
                result.add(i);
            }
            i++;
        }
        return result;
    }
}
