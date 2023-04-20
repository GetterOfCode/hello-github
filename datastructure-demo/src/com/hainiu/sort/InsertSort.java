package com.hainiu.sort;
import java.util.Arrays;
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 2, 1, 5, 2};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 插入排序
     * @param arr
     */
    private static void insertSort(int[] arr){
        for (int i = 1; i <arr.length ; i++) {
            int temp = arr[i];
            int j = i-1;
            while(arr[j] >temp&&j>=0){
                arr[j+1] = arr[j];
                j--;
            }
            if(i-1 != j){
                arr[j+1] = temp;
            }
        }
    }
}
