package com.hainiu.old;

import java.math.BigDecimal;
import java.util.Scanner;
public class BigDecimalDemo {
    public static void main(String[] args) {
        System.out.println("请输入两个数:");
        Scanner scanner = new Scanner(System.in);
        Double xValue = scanner.nextDouble();
        Double yValue = scanner.nextDouble();
        Double addValue = add(xValue, yValue);
        System.out.println(addValue);
    }
    private static Double add(Double x, Double y) {
        return new BigDecimal(String.valueOf(x)).add(new BigDecimal(String.valueOf(y))).doubleValue();
    }
}
