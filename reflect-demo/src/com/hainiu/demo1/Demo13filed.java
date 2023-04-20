package com.hainiu.demo1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Demo13filed {
    public static void main(String[] args) throws Exception {
        Class<Student> clazz = Student.class;
        Student student = clazz.getConstructor().newInstance();
        Field nameFiled = clazz.getDeclaredField("name");
        nameFiled.setAccessible(true);
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);
        nameFiled.set(student,"祁硕");
        ageField.set(student,25);
        System.out.println(nameFiled.get(student));
        System.out.println(ageField.get(student));
        System.out.println(student);
    }
}
