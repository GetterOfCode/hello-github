package com.hainiu.recursion;

public class FibonacciDemo {
    public static void main(String[] args) {
        //用递归实现的fibonacci
        System.out.println(fibonacci1(20));
        //用动态规划实现的fibonacci
        System.out.println(fibonacci2(20));
    }
    /**
     * 用递归算法找寻第n个fibonacci数
     * @param n
     * @return
     */
    private static int fibonacci1(int n) {
        if(n<=0){
            System.out.println("输入错误");
            return 0;
        }
        if(n == 1||n==2){
            return 1;
        }
        return fibonacci1(n-1)+fibonacci1(n-2);
    }

    /**
     * 用动态规划找寻第n个fibonacci数
     * @param n
     * @return
     */
    private static int fibonacci2(int n){
        if(n<=0){
            System.out.println("输入错误");
            return 0;
        }
        if(n == 1||n==2){
            return 1;
        }
        int tmp1 = 1;
        int tmp2 = 1;
        int temp = 0;
        for (int i = 3; i <=n ; i++) {
            temp = tmp2;
            tmp2 = tmp1 + tmp2;
            tmp1 = temp;
        }
        return tmp2;

    }
}
