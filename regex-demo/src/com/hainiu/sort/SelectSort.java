package com.hainiu.sort;
/**
 * 选择排序
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {5,6,12,3,1,2};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    /**
     * 选择排序的具体实现
     * @param arr 传入一个整型数组
     */
    private static void sort(int[] arr){
        int min = 0;
        for (int i=0; i<arr.length-1; i++){
            min = i;
            for (int j=i+1;j<arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }

            if(i!=min){
                swap(arr,i,min);
            }
            for (int i1 : arr) {
                System.out.print(i1+" ");
            }
            System.out.println("");
        }
    }
    /**
     * 数组中元素交换
     * @param arr 数组
     * @param i 元素下标
     * @param j 元素下标
     */
    private static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
