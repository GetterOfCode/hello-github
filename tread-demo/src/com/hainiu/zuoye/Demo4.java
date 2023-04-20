package com.hainiu.zuoye;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Demo4 {
    public static void main(String[] args) {
//        public ThreadPoolExecutor(int corePoolSize,
//                              int maximumPoolSize,
//                              long keepAliveTime,
//                              TimeUnit unit,
//                              BlockingQueue<Runnable> workQueue,
//                              ThreadFactory threadFactory,
//                              RejectedExecutionHandler handler) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 5, 2,
                TimeUnit.SECONDS, new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i <10;i++) {
            threadPoolExecutor.submit(()-> System.out.println(Thread.currentThread().getName()));
        }
    }
}
