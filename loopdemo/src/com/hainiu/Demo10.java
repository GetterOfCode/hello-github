package com.hainiu;

public class Demo10 {
    public static void main(String[] args) {
        int nums = getNums(20);
        System.out.println(nums);

    }
    private static int getNums(int money){
        int empMoney = money;
        int bottleNumber = 0;
        int drinkNumber = 0;
        while(empMoney>=3){
            bottleNumber = empMoney/3;
            drinkNumber += bottleNumber;
            empMoney =empMoney%3+bottleNumber;
        }
        return drinkNumber;
    }
}
