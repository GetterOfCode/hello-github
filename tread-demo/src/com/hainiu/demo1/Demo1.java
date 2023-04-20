package com.hainiu.demo1;

public class Demo1 {
    public static void main(String[] args) {
        Mytickets mt = new Mytickets();
        Thread t1 = new Thread(mt,"窗口一");
        Thread t2 = new Thread(mt,"窗口二");
        Thread t3 = new Thread(mt,"窗口三");
        t1.start();
        t2.start();
        t3.start();



    }
}
