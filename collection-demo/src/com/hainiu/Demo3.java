package com.hainiu;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;
/**
 * HashSet 存储几个学生对象，要求如果对象的所有属性都相同就认为是重复。并遍历结果。
 */
public class Demo3 {
    public static void main(String[] args) {
        Set<Student> stus = new HashSet<Student>();
        stus.add(new Student("tom",18));
        stus.add(new Student("tom",17));
        stus.add(new Student("jerry",18));
        stus.add(new Student("lucy",21));
        stus.add(new Student("tom",18));
//        stus.add(new Student("tom",18));
        //foreach
        stus.forEach(System.out::println);
        //增强for
        for (Student student : stus) {
            System.out.println(student);
        }
        System.out.println("================================");
        //Iterator
        Iterator<Student> iterator = stus.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("+++++++++++++++++++++++++++++");
    }
}
