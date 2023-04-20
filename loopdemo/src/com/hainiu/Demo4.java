package com.hainiu;

public class Demo4 {

/*
世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
假如我有一张足够大的纸，它的厚度是0.1毫米。请问，我折叠多少次，可以超过珠穆朗玛峰的高度?

1、定义变量存储数据 山的高度 纸的厚度
2、折叠次数 是统计  定义计数器
3、当纸的厚度没有超过山的高度 就进入循环
4、纸的厚度变为原来的2倍
    记录一次
5、循环结束打印次数

 */
    public static void main(String[] args) {
        int count = 0;
        double  height = 8844430;
        double depth = 0.1;
        while(depth < height){
            depth *= 2;
            count++;
            System.out.println(depth);
        }
        System.out.println(count);

    }

}
