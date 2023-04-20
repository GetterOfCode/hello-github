package com.hainiu.sort;

import java.util.Arrays;
public class PopSort {
    public static void main(String[] args) {
        int[] a = new int[]{2,1,4,3,5,2,1};
        popSort(a);
        System.out.println(Arrays.toString(a));
    }
    /**
     * 冒泡排序
     * @param arr
     */
    private static void popSort(int[] arr){
        int flag = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    swap(arr,j,j+1);
                    flag = 1;
                }
            }
            if (flag == 0) {
                return;
            }
        }
    }
    /**
     * 交换
     * @param a
     * @param b
     */
    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
