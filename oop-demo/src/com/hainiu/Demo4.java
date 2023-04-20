package com.hainiu;

/**
 * 手机继承抽象类 和实现一系列接口案例
 */

public class Demo4 {
    public static void main(String[] args) {
        Phone dumbPhone = new DumbPhone("波导",500);
        Phone smartPhone = new SmartPhone("iphone",5000);
        active(dumbPhone,"张三");
        active(smartPhone,"李红");
    }
    private static void active(Phone phone,String name){
        phone.open();
        phone.call(name);
        if(phone instanceof SmartPhone){
            ((SmartPhone) phone).help();
            ((SmartPhone) phone).playGame();
        }else if(phone instanceof DumbPhone){
            ((DumbPhone) phone).help();
        }else {
            return;
        }
    }
}
