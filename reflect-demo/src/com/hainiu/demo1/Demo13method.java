package com.hainiu.demo1;

import java.lang.reflect.Method;

public class Demo13method {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = Student.class;
        Student student = clazz.getDeclaredConstructor(String.class,int.class).newInstance("祁硕",23);
        Method getName = clazz.getMethod("getName");
        Object nameValue = getName.invoke(student);
        System.out.println(nameValue);
        Method setName = clazz.getMethod("setName", String.class);
        setName.invoke(student, "倪晨晨");
        System.out.println(student);
        Method add = clazz.getDeclaredMethod("add", Integer.class, Integer.class);
        add.setAccessible(true);
        Object addValue = add.invoke(student,1,2);
        System.out.println(addValue);


    }
}
