package com.hainiu.newP;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Re {
    public static void main(String[] args) {
        verify();
        replacement();
        split();
        fetch();
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
    /**
     * 校验
     */
    public static void verify(){
        //日期检验yyyy-MM-dd HH
        String regex = "^(\\d{4}[-])(([0]{0,1}[1-9])|([1][0-2]))-(([0]{0,1}[1-9])|([1]\\d)|([2]\\d)|([3][01]))(\\s*)$";
//        String regex = "^([1-9]\\d{3}年)(([0]{0,1}[1-9]月)|([1][0-2]月))$";

        boolean matches = "2021-6-2  ".matches(regex);
        System.out.println(matches);
    }
    /**
     * 替换
     */
    public static void replacement(){
        String str = "张三的电话号码是：13877778888，李四的电话号码是：13966669999，王五的电话号码是：18898765432。";
        String regex = "1[3-9]\\d{9}";
        String afterReplace = str.replaceAll(regex, "*************");
        System.out.println(afterReplace);
        String afterReplaceFirst = str.replaceFirst(regex, "***");
        System.out.println(afterReplaceFirst);
    }
    /**
     * 拆分
     */
    public static void split(){
        String str = "java, python,   33,44,     55";
        String[] split = str.split(",\\s*");
        System.out.println(split.length);
        for (String s : split) {
            System.out.println(s);
        }
    }
    /**
     * 获取
     */
    public static void fetch(){
        String str = "张三的电话号码是：13877778888，李四的电话号码是：" +
                "13966669999，王五的电话号码是：18898765432。";
        String regex = "1[3-9]\\d{9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
