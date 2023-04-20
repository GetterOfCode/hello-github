package com.hainiu;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println(saveMoney1(52));
        System.out.println(saveMoney2(52));


    }
    //法一等差数列
    private static int saveMoney1(int weeks){
        if (weeks<1){
            return 0;
        }
        int firstWeekMoney = 10;
        int endWeekMoney = 10*weeks;
        return (firstWeekMoney+endWeekMoney)*weeks/2;
    }
    //while循环
    private static int saveMoney2(int weeks){
        int money = 0;
        int theWeekSaveMoney = 0;
        for(int i = 0; i < weeks; i++){
            theWeekSaveMoney +=10;
            money +=theWeekSaveMoney;
        }
        return money;
    }
}
