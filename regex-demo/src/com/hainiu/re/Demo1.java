package com.hainiu.re;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //敏感词tmd检测 regex
        String reg = "[Tt]\\s*[Mm]\\s*[Dd]";
        System.out.println("请输入一段文本：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String s1 = s.replaceAll(reg, "***");
        System.out.println(s1);
    }
}
