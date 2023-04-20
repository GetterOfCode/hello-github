package com.hainiu.old;

import java.util.Scanner;
public class StringDemo {
    private static final String USERNAME= "admin";
    public static final String PASSWORD = "123456";
    public static Scanner scanner = new Scanner(System.in);
    public static String username = "";
    public static String password = "";
    public static void main(String[] args) {
        System.out.println("请输入用户名:");

        username = scanner.nextLine();
        System.out.println("请输入您的密码:");
        password = scanner.nextLine();
        login(username, password);
    }

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     */
    private static void login(String username, String password) {
        int count = 0;
        while (!compareStr(username,password)){
            count++;
            if (count == 5){
                return;
            }
            System.out.println("账户名或密码错误,您还有" + (5 - count) + "次机会");
            System.out.println("请输入用户名:");
            username = scanner.nextLine();
            System.out.println("请输入密码:");
            password = scanner.nextLine();
        }
        System.out.println("登陆成功！");
    }
    /**
     * 对应字符串比较功能
     * @param username 用户名
     * @param password 密码
     * @return
     */
    public static boolean compareStr(String username, String password){
        return USERNAME.equals(username) && PASSWORD.equals(password);
    }
}
