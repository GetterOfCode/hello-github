package com.hainiu.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] ints = {5, 1, 2, 3, 4, 1, 5, 9, 7, 2};
        mergeSort(ints);
        System.out.println(Arrays.toString(ints));

    }

    /**
     * 归并排序
     * @param arr
     */
    private static void mergeSort(int[] arr){
        int[] temp =  new int[arr.length];
        mergeSort(arr, temp,0,arr.length-1);
    }

    /**
     * 归并排序具体实现
     * @param arr
     * @param temp
     * @param i
     * @param i1
     */
    private static void mergeSort(int[] arr, int[] temp, int start, int end) {
        if(start<end) {
            int leftstart = start;
            int leftend = (start + end) / 2;
            int rightstart = leftend + 1;
            int rightend = end;
            mergeSort(arr, temp, leftstart, leftend);
            mergeSort(arr, temp, rightstart, rightend);
            int num = end - start+1;
            int tempStart = leftstart;
            while(leftstart<=leftend && rightstart<=rightend ){
                if (arr[leftstart]<arr[rightstart]){
                    temp[tempStart++] = arr[leftstart++];
                }else {
                    temp[tempStart++] = arr[rightstart++];
                }
            }
            while(leftstart<=leftend){
                temp[tempStart++] = arr[leftstart++];
            }
            while(rightstart<=rightend){
                temp[tempStart++] = arr[rightstart++];
            }
            for (int i = 0; i <num;i++){
                arr[rightend] = temp[rightend];
                rightend--;
            }
        }
    }
}
