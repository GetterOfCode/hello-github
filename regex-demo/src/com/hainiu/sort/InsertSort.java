package com.hainiu.sort;
import java.util.Arrays;
public class InsertSort implements ArraySort {
    private static InsertSort insertSort = null;
    private InsertSort(){};
    public static InsertSort getInstance(){
        if(insertSort == null){
            return new InsertSort();
        }else{
            return insertSort;
        }
    }
    public static void main(String[] args) {
//        int[] sort = new InsertSort().sort(new int[]{3, 12, 1, 2, 3,});
//        for (int i : sort) {
//            System.out.println(i);
//        }
        int[] sort = InsertSort.getInstance().sort(new int[]{3, 12, 1, 2, 3});
//        int[] sort = asort.sort(new int[]{3, 12, 1, 2, 3,});
        for (int i : sort) {
            System.out.println(i);
        }
    }
    @Override
    public int[] sort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;
            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            if(j != i){
                arr[j] = temp;
            }
        }
        return arr;
    }
}
