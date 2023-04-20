package com.hainiu.demo3;

import java.util.concurrent.locks.ReentrantLock;

public class Mytickets implements Runnable{
    private Integer ticketNumber = 100;
    private ReentrantLock rlock = new ReentrantLock();
    @Override
    public void run() {

        while(true){
            rlock.lock();
            try {
                if(ticketNumber <=0){
                    break;
                }
                System.out.println(Thread.currentThread().getName()+"正在售第"+ticketNumber--+"张票 ");
            } finally {
                rlock.unlock();
            }


        }
    }
}
