package com.hainiu.demo1;

import java.lang.reflect.Constructor;

public class Demo12constructor {
    public static void main(String[] args)throws Exception {
        Class<Student> clazz = Student.class;
        Constructor<Student>[] declaredConstructors = (Constructor<Student>[]) clazz.getDeclaredConstructors();
        for (Constructor<Student> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        Constructor<Student> declaredConstructor1 = clazz.getDeclaredConstructor(String.class);
        declaredConstructor1.setAccessible(true);
        Student stu1 = declaredConstructor1.newInstance("倪晨晨");
        System.out.println(stu1);

        Constructor<Student> declaredConstructor = clazz.getDeclaredConstructor();
        Student stu = declaredConstructor.newInstance();
        System.out.println(stu);

        Constructor<Student> declaredConstructor2 = clazz.getDeclaredConstructor(String.class, int.class);
        Student stu2 = declaredConstructor2.newInstance("祁硕", 18);
        System.out.println(stu2);


    }
}
