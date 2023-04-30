package com.hainiu;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/*
定义一个Worker类（属性 姓名name 年龄age 工资salary）
    创建几个Worker对象，存入TreeMap集合，要求：按照薪资从大到小排序，如果薪资相同，按照年龄从小到大；如果也相同，按照姓名字典顺序排序
 */
public class Demo4 {
    public static void main(String[] args) {
        TreeSet<Worker> workers = new TreeSet<>(new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                int i = o2.getSalary()-o1.getSalary();
                if (i == 0){
                    i = o1.getAge()-o2.getAge();
                }
                if(i==0){
                    i = o1.getName().compareTo(o2.getName());
                }
                if(i==0){
                    i = 0;
                }
                return i;
            }
        });
        workers.add(new Worker("james",27,9000));
        workers.add(new Worker("james",27,8000));
        workers.add(new Worker("james",26,9000));
        workers.add(new Worker("jarry",27,9000));
        workers.add(new Worker("amy",27,9000));
        workers.add(new Worker("boe",27,9000));
        //foreach
        workers.forEach(System.out::println);
    }
}
