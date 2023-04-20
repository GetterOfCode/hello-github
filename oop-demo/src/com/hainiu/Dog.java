package com.hainiu;

/**
 * Dog class extends Animal
 * @author qs
 */

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    @Override
    void eat() {
        System.out.println(this.name+"狗在吃肉");
    }
    void wangwang(){
        System.out.println(this.name+":汪汪！");
    }
}
