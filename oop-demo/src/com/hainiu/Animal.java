package com.hainiu;

/**
 * Animal interface
 * @author qs
 */

public abstract class Animal {
    public String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }



    abstract void eat();
}
