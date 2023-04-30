package com.hainiu.recursion;

/**
 * hanoi tower problem, 解决汉诺塔问题 一般递归问题都可以用动态规划算法解决。
 * @author qishuo
 *  @date 2023/4/30
 *
 */
public class HanoiDemo {
    public static void main(String[] args) {
        System.out.println(hanoi1(6));
        System.out.println(hanoi2(6));
    }

    /**
     * 递归实现的hanoi
     * @param n
     * @return
     */
    private static int hanoi1(int n){
        if(n<=0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return 2*hanoi1(n-1)+1;

    }
    /**
     * 动态规划实现hanoi
     * @param n
     * @return
     */
    private static int hanoi2(int n){
        if(n<=0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int tmp1 = 1;
//        int temp =0;
        for (int i = 2; i <=n ; i++) {
            tmp1 = 2*tmp1+1;
        }
        return tmp1;

    }

}
