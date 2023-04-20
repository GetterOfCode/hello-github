package com.hainiu;

public class Demo6 {
    public static void main(String[] args) {
        //正三角
        for (int i = 1; i <=9; i++){
            for(int j = 1; j <=i;j++){
                System.out.print(j + "*" +i +"="+i*j+"\t");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------------------------------------");
        //倒三角
        for (int i = 9; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" +i +"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}
