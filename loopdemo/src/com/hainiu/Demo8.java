package com.hainiu;

public class Demo8 {
    public static void main(String[] args) {
        System.out.println(throwAway1(1543));
        System.out.println(throwAway2(1543));
    }
    //法一 传统方式 比较垃圾
    private static int throwAway1(int number) {
        int count = 0;
        while(number>0){
            if(number%2 == 1){
                count++;
            }
            number /= 2;
        }
        return count;
    }
    //法二 转化成二进制字符串 数一的个数
    private static int throwAway2(int number){
        int sum = 0;
        String binaryString = Integer.toBinaryString(number);
        for (int i = 0;i<binaryString.length();i++){
            sum += Integer.valueOf(String.valueOf(binaryString.charAt(i)));
        }
        return sum;
    }

}
