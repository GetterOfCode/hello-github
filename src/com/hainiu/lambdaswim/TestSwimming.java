package com.hainiu.lambdaswim;
@FunctionalInterface
interface Swimming{
    void swim();
}
public class TestSwimming {
    public static void main(String[] args) {
//        goSwimming(new Swimming() {
//            @Override
//            public void swim() {
//                System.out.println("游泳");
//            }
//        });
        goSwimming(()-> System.out.println("游泳"));

    }
    public static void goSwimming(Swimming sw) {
        sw.swim();

    }
}
