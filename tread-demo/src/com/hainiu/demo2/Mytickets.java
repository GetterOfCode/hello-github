package com.hainiu.demo2;

public class Mytickets implements Runnable{
    private Integer ticketNumber = 100;
    @Override
    public void run() {

        while(true){

            synchronized (this) {
                if(ticketNumber <=0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(Thread.currentThread().getName()+"正在售第"+ticketNumber--+"张票 ");
            }
        }
    }
}
