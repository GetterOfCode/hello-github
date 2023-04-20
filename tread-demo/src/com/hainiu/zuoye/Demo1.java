package com.hainiu.zuoye;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Demo1 {
    public static void main(String[] args) {
//        test1();
//        test2();
        test3();


    }

    /**
     * 用callable接口实现带有返回值的线程任务
     */
    private static void test3() {
        MyCallable myCallable = new MyCallable();
        FutureTask<Integer> integerFutureTask1 = new FutureTask<>(myCallable);
        FutureTask<Integer> integerFutureTask2 = new FutureTask<>(myCallable);
        Thread thread1 = new Thread(integerFutureTask1,"thread1");
        Thread thread2 = new Thread(integerFutureTask2,"thread2");
        thread1.start();
        thread2.start();

    }

    /**
     * runnable接口实现
     */
    private static void test2() {
        Thread thread1 = new Thread(new MyRunnable(), "thread1");
        Thread thread2 = new Thread(new MyRunnable(), "thread2");
        thread1.start();
        thread2.start();
    }

    /**
     * 继承Thread类实现
     */
    private static void test1() {
        MyTread myTread1 = new MyTread();
        MyTread myTread2 = new MyTread();
        myTread1.start();
        myTread2.start();
    }

}
class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName()+"计算结果为"+sum);
        return sum;
    }
}
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
class MyTread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+" "+i);
        }
    }
}