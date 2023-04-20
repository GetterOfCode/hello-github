package com.hainiu;

import org.omg.PortableServer.SERVANT_RETENTION_POLICY_ID;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private transient int height;
    public static final long serialVersionUID = 1L;

    public Student() {
    }

    public Student(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
