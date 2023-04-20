package com.hainiu.demo1;

public class Demo11 {
    public static void main(String[] args) throws ClassNotFoundException{
        Class<Student> clazz = (Class<Student>) Class.forName("com.hainiu.demo1.Student");
        System.out.println(clazz);
        Class<Student> clazz1 = Student.class;
        System.out.println(clazz1);
        Class< Student> clazz2 =(Class<Student>) new Student().getClass();
        System.out.println(clazz2);
        System.out.println(clazz1 == clazz2);

    }
}
