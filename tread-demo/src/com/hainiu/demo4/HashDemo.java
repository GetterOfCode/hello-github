package com.hainiu.demo4;

import java.util.HashMap;
import java.util.concurrent.*;

public class HashDemo {
    public static void main(String[] args) {
        ConcurrentHashMap<String,String> hashMap = new ConcurrentHashMap<>();
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3,
                5,
                60,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<>(5),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );
        for (int i = 0; i < 3; i++) {
            pool.submit(()->{
                for (int j = 0;j<1000; j++) {
                    hashMap.put(String.valueOf(j), String.valueOf(j));

                }
            });

        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        hashMap.forEach((k,v)-> System.out.println(k+":"+v));





    }
}
