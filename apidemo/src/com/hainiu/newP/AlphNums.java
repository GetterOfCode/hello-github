package com.hainiu.newP;

public class AlphNums {
    public static void main(String[] args) {
        String str = "asdfasdadasd4as65465sad4as6dqw124d4a6s5(*(&(dsad456dasd";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)<='z'&&str.charAt(i)>='a')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')){
                count++;
            }
        }
        System.out.println(count);
    }
}
