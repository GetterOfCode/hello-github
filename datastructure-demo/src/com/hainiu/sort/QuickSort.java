package com.hainiu.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = new int[]{2,1,4,3,5,2,1};
        quickSort(a);
        System.out.println(Arrays.toString(a));

    }
    /**
     * 快速排序
     * @param arr
     */
    private static void quickSort(int[] arr){
        quickSort(arr, 0, arr.length-1);
    }
    /**
     * 快速排序具体实现
     * @param arr
     * @param left
     * @param right
     */
    private static void quickSort(int[] arr, int left, int right) {
        if(left >=right){
            return;
        }
        int l = left;
        int r = right;
        int temp = arr[left];
        while(l<r) {
            while (l < r && arr[r] > temp) {
                r--;
            }
            if (l < r) {
                arr[l] = arr[r];
                l++;
            }
            while(l < r && arr[l] < temp) {
                l++;
            }
            if(l<r){
                arr[r] = arr[l];
                r--;
            }
        }
        arr[l] = temp;
        quickSort(arr,left,l-1);
        quickSort(arr,l+1,right);

    }
}
