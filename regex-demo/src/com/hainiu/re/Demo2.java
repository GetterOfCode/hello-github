package com.hainiu.re;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //文本去重
        System.out.println("请输入一段文本：");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(text);
        String reg1 = "\\.";
        String reg2 = "(.)\\1+";
        text = text.replaceAll(reg1, "").replaceAll(reg2,"$1").trim();
        System.out.println(text);
    }
}
