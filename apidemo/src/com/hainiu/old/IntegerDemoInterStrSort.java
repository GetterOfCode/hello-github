package com.hainiu.old;

import java.util.Arrays;
public class IntegerDemoInterStrSort {
    // "12 56 34 112 23 66 11 18 35" -- 把其中的数据按照从小到大的顺序排列 组成一个新的字符串
    public static void main(String[] args) throws Exception {
        String intStr = "12 56 34 112 23 66 11 18 35";
        String[] strArray = intStr.split(" ");
//        List<Integer> numbers = new ArrayList();
        int[] numbers = new int[strArray.length];
        for (int i = 0; i<strArray.length; i++) {
//            System.out.println(s);
            numbers[i] = Integer.valueOf(strArray[i]);
        }
        Arrays.sort(numbers);
        StringBuilder stringBuilder = new StringBuilder();
        for (int number : numbers) {
            stringBuilder.append(number);
        }
        System.out.println(stringBuilder.toString());
    }
}
