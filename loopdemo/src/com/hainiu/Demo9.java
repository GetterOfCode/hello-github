package com.hainiu;

import java.util.ArrayList;
import java.util.List;

public class Demo9 {
    public static void main(String[] args) {
//        int count = 0;
        List<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i <= 4 ; i++) {
            for (int j =1;j<=4;j++) {
                for (int k = 1; k <=4; k++) {
                    if (!(i==j||j==k||k==i)) {
                        numbers.add(i * 100 + j * 10 + k);
                    }
                }
            }
        }
//        System.out.println(count);
        System.out.println(numbers);
//        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
