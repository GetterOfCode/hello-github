package com.hainiu.sort;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 2, 1, 5, 2};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    /**
     * 选择排序
     * @param arr 待排数组
     */
    private static void selectSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(minIndex != i){
                swap(arr,minIndex,i);
            }
        }

    }

    /**
     * 交换数组中两个位置的元素
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
