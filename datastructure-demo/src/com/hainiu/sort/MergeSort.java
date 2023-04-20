package com.hainiu.sort;

import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 2, 1, 5, 2};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /**
     * 归并排序
     * @param arr
     */
    private static void mergeSort(int[] arr){
        int[] temp = new int[arr.length];
        mergeSort(arr,temp,0,arr.length-1);
    }
    /**
     * 归并排序具体实现,开辟了一个临时数组
     * @param arr
     * @param temp
     * @param start
     * @param end
     */
    private static void mergeSort(int[] arr,int[] temp,int start,int end){
        if(start<end) {
            int mid = (start + end) / 2;
            //递归分割
            mergeSort(arr, temp, start, mid);
            mergeSort(arr, temp, mid + 1, end);
            //定义左右两部分元素的坐标的起始
            int leftStart = start;
            int leftEnd = mid;
            int rightStart = mid + 1;
            int rightEnd = end;
            int num = end - start + 1;
            int tempStart = leftStart;
            //合并的过程
            while (leftStart <= leftEnd && rightStart <= rightEnd) {
                if (arr[leftStart] < arr[rightStart]) {
                    temp[tempStart++] = arr[leftStart++];
                } else {
                    temp[tempStart++] = arr[rightStart++];
                }
            }
            while (leftStart <= leftEnd) {
                temp[tempStart++] = arr[leftStart++];
            }
            while (rightStart <= rightEnd) {
                temp[tempStart++] = arr[rightStart++];
            }
            //rightEnd在上述过程中没变，故用来标记位置
            for (int i = 0; i < num; i++) {
                arr[rightEnd] = temp[rightEnd];
                rightEnd--;
            }
        }

    }
}
