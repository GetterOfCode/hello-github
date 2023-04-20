package com.hainiu.sort;
import java.math.BigDecimal;
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        System.out.println("请输入要排序的随机数个数：");

        Scanner scanner = new Scanner(System.in);
        int numbers = scanner.nextInt();
        Random rand = new Random();
        int[] arr = new int[numbers];
//        StringBuilder stringBuilder = new StringBuilder ();
        for (int i = 0; i < numbers; i++) {
//            stringBuilder.append(rand.nextInt(10000));
            arr[i] = rand.nextInt(1000)+1;
        }
        System.out.println("快速排序：");
        int[] test = new int[arr.length];
        test = arr.clone();
//        String[] split = stringBuilder.toString().split("");
//        System.out.println("排序前：");
//        for (int i : test) {
//            System.out.print(i+" ");
//        }

        Long before1 =System.nanoTime();
        quickSort(test);
        Long after1 = System.nanoTime();
//        System.out.println("排序后：");
//        for (int i : test) {
//            System.out.print(i+" ");
//        }
        BigDecimal decimal = divideToBigDecimal((after1 - before1));
        System.out.println("快速排序所需要时间："+decimal+"秒！");
        //test
//        for (int i : arr) {
//            System.out.print(i+" ");
//        }
        System.out.println("--------------------------------");
        System.out.println("冒泡排序：");
        test = arr.clone();
//        String[] split = stringBuilder.toString().split("");
//        System.out.println("排序前：");
//        for (int i : test) {
//            System.out.print(i+" ");
//        }

        Long before2 =System.nanoTime();
        //冒泡排序
        popSort(test);
        Long after2= System.nanoTime();
//        System.out.println("排序后：");
//        for (int i : test) {
//            System.out.print(i+" ");
//        }
        decimal = divideToBigDecimal((after2-before2));
        System.out.println("冒泡排序所需要时间："+decimal+"秒！");
        System.out.println("--------------------------------");
//        System.out.println("--------------------------------");

        System.out.println("选择排序：");
        test = arr.clone();
//        String[] split = stringBuilder.toString().split("");
//        System.out.println("排序前：");
//        for (int i : test) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
        Long before3 =System.nanoTime();
        //选择排序
        selectSort(test);
        Long after3= System.nanoTime();
//        System.out.println("排序后：");
//        for (int i : test) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
        decimal=divideToBigDecimal((after3-before3));
        System.out.println("选择排序排序所需要时间："+decimal+"秒！");
        System.out.println("--------------------------------");
//        System.out.println("--------------------------------");

        System.out.println("插入排序：");
        test = arr.clone();
//        String[] split = stringBuilder.toString().split("");
//        System.out.println("排序前：");
//        for (int i : test) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
        Long before4 =System.nanoTime();
        insertSort(test);
        Long after4= System.nanoTime();
//        System.out.println("排序后：");
//        for (int i : test) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
        decimal = divideToBigDecimal((after4 - before4));
        System.out.println("插入排序所需要时间："+decimal+"秒！");
    }

    /**
     *divide
     */
    private static BigDecimal divideToBigDecimal(Long time){
        return new BigDecimal(time).divide(new BigDecimal(1000000000));
    }
    /**
     * 快速排序
     * @param arr 需要排序的数组
     */
    private static void quickSort(int[] arr){
//        quickSort1(arr,0,arr.length-1);
        quickSort2(arr,0,arr.length-1);
    }
    //实现一
    private static void quickSort1(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp = arr[left];
        int p1 = left;
        int p2 = right;
        while(p1<p2){
            if(arr[p2]<temp){
                if(arr[p1]>temp){
//                    arr[p2] = arr[p1];
                    int tempNum = arr[p1];
                    arr[p1] = arr[p2];
                    arr[p2] = tempNum;
                    p2--;
                }else {
                    p1++;
                }
            }else{
                p2--;
            }
        }
        arr[left] = arr[p1];
        arr[p1] = temp;
        quickSort1(arr,left,p1-1);
        quickSort1(arr,p1+1,right);
    }
    //实现二
    private static void quickSort2(int[] arr,int left,int right){
        if(left>=right){
            return;
        }
        int temp = arr[left];
        int p1 = left;
        int p2 = right;
        while(p1<p2) {
            while((p1<p2) && (arr[p2]>temp)){
                p2--;
            }
            if(p1<p2) {
                arr[p1] = arr[p2];
                p1++;
            }
            while((p1<p2) && (arr[p1]<temp)){
                p1++;
            }
            if(p1<p2) {
                arr[p2] = arr[p1];
                p2--;
            }
        }
        arr[p1] = temp;
        quickSort2(arr,left,p1-1);
        quickSort2(arr,p1+1,right);
    }
    /**
     * 冒泡排序
     * @param arr
     */
    private static void popSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int flag = 0;
            for (int j=0;j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    flag = 1;
                    swap(arr,j,j+1);
                }
            }
            if(flag == 0){
                break;
            }
        }
    }

    /**
     * 选择排序的具体实现
     * @param arr 传入一个整型数组
     */
    private static void selectSort(int[] arr){
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
        }
    }

    /**
     * 插入排序
     * @param array
     */
    private static void insertSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i;
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            if(j != i){
                array[j] = temp;
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
