package com.hainiu;

public class Demo2 {

    public static void main(String[] args) {
        judgeLevel(120);
        judgeLevel(100);
        judgeLevel(65);
        judgeLevel(40);
        judgeLevel(-10);
    }

    private static void judgeLevel(int scores){
        if(100>=scores&&scores>=85){
            System.out.println("成绩优秀！");
        }else if(scores<=85&&scores>=70){
            System.out.println("成绩良好！");
        }else if( scores<=70&&scores>=60){
            System.out.println("成绩合格!");
        }else if(scores<=60&&scores>=0){
            System.out.println("成绩不及格!");
        }else {
            System.out.println("分数有误！（0-100）");
        }

    }
}
