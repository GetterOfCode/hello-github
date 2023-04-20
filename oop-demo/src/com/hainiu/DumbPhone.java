package com.hainiu;

public class DumbPhone extends Phone  implements Help{
    public DumbPhone(String brand, double price) {
        super(brand, price);
    }
    @Override
    public void open() {
        System.out.println(super.getBrand());
        super.open();
    }

    @Override
    public void help() {
        System.out.println(super.getBrand()+"dumbPhone help");

    }

    @Override
    public void call(String name) {
        System.out.println(super.getBrand()+"dumbPhone call"+name);

    }
}
