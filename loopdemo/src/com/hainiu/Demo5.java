package com.hainiu;

import java.util.Random;
import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100)+1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个1-100间的整数");
        int guess = scanner.nextInt();
        while(true) {
            if(guess == i){
                System.out.println("恭喜您猜对了！");
                break;
            }else if(guess > i){
                System.out.println("猜大了");
                System.out.println("请输入一个1-100间的整数");
                guess = scanner.nextInt();
            }else{
                System.out.println("猜小了");
                System.out.println("请输入一个1-100间的整数");
                guess = scanner.nextInt();
            }
        }


    }
}
