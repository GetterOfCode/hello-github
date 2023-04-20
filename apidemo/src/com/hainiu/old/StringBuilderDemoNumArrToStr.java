package com.hainiu.old;

public class StringBuilderDemoNumArrToStr {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,7,8,9};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (int i = 0; i < numbers.length-1; i++) {

            stringBuilder.append(numbers[i]).append(", ");

        }
        stringBuilder.append(numbers[numbers.length-1]).append(']');
        System.out.println(stringBuilder.toString());

    }
}
