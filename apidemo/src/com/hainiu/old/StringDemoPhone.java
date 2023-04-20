package com.hainiu.old;

import java.util.Scanner;
public class StringDemoPhone {
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入11位数的手机号码:");
            Scanner scanner = new Scanner(System.in);
            String phoneNumber = scanner.nextLine();
            //没用正则表达式
            if(phoneNumber.length()!=11) {
                System.out.println("请输入正确的手机号码！");
            }else {
                System.out.println("脱敏后的手机号为：" + phoneNumber.substring(0, 3).concat("****").concat(phoneNumber.substring(7)));
                break;
            }
        }
    }
}
