package com.hainiu;

public class SmartPhone extends Phone implements Help,PlayGame{
    public SmartPhone(String brand, double price) {
        super(brand, price);
    }

    @Override
    public void open() {
        System.out.println(super.getBrand());
        super.open();
    }

    @Override
    public void help() {
        System.out.println(super.getBrand()+"Smart phone help");

    }
    @Override
    public void call(String name) {
        System.out.println(super.getBrand()+"Smart phone call"+name);

    }

    @Override
    public void playGame() {
        System.out.println(super.getBrand()+"Smart phone play game");

    }
}
