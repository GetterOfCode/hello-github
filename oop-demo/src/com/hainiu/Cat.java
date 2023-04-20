package com.hainiu;

/**
 *
 * Cat cls
 * @author qs
 */

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println(this.name+"猫在吃鱼！");
    }
    void miaomiao() {
        System.out.println(this.name+":喵喵！");
    }
}
