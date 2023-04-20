package com.hainiu;

/**
 * 匿名类测试案例
 * @author qs
 */

public class Demo3 {
    public static void main(String[] args) {
        goSwimming(new Swim() {
            @Override
            void swimming() {
                System.out.println("我在游泳！！！！！");
            }
        });

    }
    private static void goSwimming(Swim swim){
        swim.swimming();
    }
}
