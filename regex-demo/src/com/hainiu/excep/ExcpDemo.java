package com.hainiu.excep;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcpDemo {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.println("hello world");
//        runtimeException(null);
//        Integer integer = Integer.valueOf("1");
//        System.out.println(new Student("祁硕", 17));

        studentIn();

    }
    public static void studentIn(){
        System.out.println("请输入您的姓名：");
        String stuName = scanner.nextLine();
        System.out.println("请输入您的年龄：");
        String  stuAge = scanner.nextLine();
        Integer stuAgeInt = Integer.valueOf(stuAge);
        Student student = new Student(stuName, stuAgeInt);
        System.out.println(student);
    }
//    private static void runtimeException(int[] array){
//        if(array == null){
//            throw new NullPointerException("空指针异常");
//
//        }
//        try {
//            System.out.println(array.length);
//
//
//        }catch (NullPointerException e){
//            e.getMessage();
//        }
//
//    }
//    private static void compilingException(){
//
//    }
}
