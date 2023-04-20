package com.hainiu.zuoye;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo3 {
    public static void main(String[] args) {
//        test1();
        test2();
    }

    /**
     * 定义一个table为竞争资源 或锁 桌子容量可以自己选择 相当于缓存队列 保证生产者生产产品并放到桌子上
     * 或者消费者从桌子上消费产品 为一个隔离的原子事件
     * 为了避免死锁 ：规定当桌子放满产品时，生产者主动让出桌子资源;或者当桌子为空时，消费者主动让出桌子资源
     */
    private static void test2() {
        Table table = new Table(1);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
                5,
                60,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
                );
        for (int i = 0; i <3 ; i++) {
            pool.submit(new Producer1(table));
        }
        for (int i = 0; i <7;i++){
            pool.submit(new Consumer1(table));
        }

    }

    /**
     * 阻塞队列完成生产者消费者模拟
     */
    private static void test1() {
        ArrayBlockingQueue<Object> queue = new ArrayBlockingQueue<>(10);

        Thread producer= new Thread(new Producer(queue),"producer");
        Thread consumer= new Thread(new Consumer(queue),"consumer");
        producer.start();
        consumer.start();
    }
}
class Table{
    private int capacity;
    private int size = 0;

    public Table(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
class Producer1 implements Runnable {
    private Table table;
    public Producer1(Table table) {

        this.table = table;
    }

    @Override
    public void run() {
        while(true){
            synchronized (table) {
                if (table.getSize()>=table.getCapacity()){
    //                table.setSize(table.getSize()+1);
//                    try {
//
//                        table.wait();
//
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }else {
                    table.setSize(table.getSize()+1);
                    System.out.println(Thread.currentThread().getName()+"生产了一个！还剩"+table.getSize());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
//                table.notifyAll();
            }
        }
    }
}
class Consumer1 implements Runnable {
    private Table table;
    public Consumer1(Table table) {
        this.table = table;
    }
    @Override
    public void run() {
        while (true){
            synchronized (table) {
                if (table.getSize()<=0){
//                    try {
//
//                        table.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
                }else {
                    table.setSize(table.getSize()-1);
                    System.out.println(Thread.currentThread().getName()+"消费了一个！还剩"+table.getSize());
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
//                table.notifyAll();

            }
        }

    }
}
class Consumer implements Runnable{
    private ArrayBlockingQueue<Object> queue;

    public Consumer(ArrayBlockingQueue<Object> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            Object data = null;
            try{
                data = queue.take();
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"消费一个产品【"+data+"】，目前桌子上还剩"+queue.size()+"个！");
        }
    }
}
class Producer implements Runnable {
    private ArrayBlockingQueue<Object> queue;

    public Producer(ArrayBlockingQueue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                queue.put("产品");
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"生产一个产品，目前桌子上还剩"+queue.size()+"个！");

        }

    }
}