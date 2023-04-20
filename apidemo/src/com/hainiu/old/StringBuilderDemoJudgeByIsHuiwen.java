package com.hainiu.old;

import java.util.Scanner;
public class StringBuilderDemoJudgeByIsHuiwen {
    public static void main(String[] args) {
        System.out.println("请输入：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isHuiwen(str));
    }
    /**
     * 判断是否是回文字符串功能
     * @param str 需要判断的字符串
     * @return 输出返回结果是否为回文字符串
     */
    private static boolean isHuiwen(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
