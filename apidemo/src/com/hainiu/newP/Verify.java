package com.hainiu.newP;

import java.util.Random;
import java.util.Scanner;
public class Verify {
    public static StringBuilder sb = new StringBuilder();
    public static Random random = new Random();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String ver = ver();
            System.out.println("验证码为："+ver);
            String str = scanner.nextLine();

            if (ver.equalsIgnoreCase(str)) {
                System.out.println("验证码校验成功！");
                break;
            }
            System.out.println("验证码输入错误！");
        }

    }
    private static String ver(){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

//        int r = random.nextInt(str.length());
        for (int i = 0; i < 4; i++) {
            sb.append(str.charAt(random.nextInt(str.length())));
        }
        String s = sb.toString();
        sb.delete(0,s.length());
        return s;

    }
}
