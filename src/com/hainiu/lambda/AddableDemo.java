package com.hainiu.lambda;

public class AddableDemo {
    public static void main(String[] args) {
        useAddable((x,y)-> x+y);

    }
    public static void useAddable(Addable addable){
        int add = addable.add(20, 10);
        System.out.println(add);
    }
}
