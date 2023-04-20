package com.hainiu.old;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class IsPrimeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numStr = scanner.nextLine();
        int num = Integer.valueOf(numStr);
        List<Integer> primeArray = new ArrayList<>();
        searchPrime(num,primeArray);
//        System.out.println(primeArray);
        for (Integer integer : primeArray) {
            System.out.println(integer);
        }
    }
    /**
     *
     * @param num 范围数
     * @param primeArray素数数组 初始为空
     * @return 返回num范围内的素数
     */
    private static List<Integer> searchPrime(int num, List<Integer> primeArray) {
        if(num < 2){
            return null;
        }
        for(int i = 2; i <= num;i++){
            if(isPrime(i)){
                primeArray.add(i);
            }
        }
        return primeArray;
    }
    /**
     * 判断该数是否为素数
     * @param num 整数参数
     * @return boolean
     */
    private static boolean isPrime(int num) {
        int sqrtNum = (int)Math.sqrt(num);
        for (int i = 2; i <= sqrtNum; i++) {
            if(num%i==0){
                return false;
            }
        }
        return  true;
    }
}
