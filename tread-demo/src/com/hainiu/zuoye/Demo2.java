package com.hainiu.zuoye;

import java.util.concurrent.locks.ReentrantLock;

public class Demo2{
    public static void main(String[] args) {
//        test1();
        test2();


    }

    /**
     * ReentrantLock 加锁
     */
    private static void test2() {
        Ticket ticket = new Ticket();
        Thread thread1 = new Thread(ticket, "thread1");
        Thread thread2 = new Thread(ticket, "thread2");
        thread1.start();
        thread2.start();
    }

    /**
     * 使用线程同步关键字synchronized 实现
     */
    private static void test1() {
        Tickets tickets = new Tickets();
        Thread thread1 = new Thread(tickets,"thread1");
        Thread thread2 = new Thread(tickets,"thread2");
        thread1.start();
        thread2.start();
    }
}
class Ticket implements Runnable {
    private int num = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (num<=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"正在售出第"+num--+"张票！");
            } finally {
                lock.unlock();
            }
        }

    }
}


class Tickets implements Runnable {
    private int tickets = 100;

    @Override
    public void run() {
        while(true){
            synchronized (this) {
                if (tickets <= 0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"正在售出第"+tickets--+"张票！");
            }

        }

    }
}
