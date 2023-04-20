package com.hainiu.sort;

public class PopSort {
    public static void main(String[] args) {
        int[] arr = {13,1,2,3,4,5};
        sort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    private static void sort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int flag = 0;
            for (int j=0;j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    flag = 1;
                    swap(arr,j,j+1);
                }
            }
            for (int i1 : arr) {
                System.out.print(i1+" ");
            }
            System.out.println("");
            if(flag == 0){
                break;
            }
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
