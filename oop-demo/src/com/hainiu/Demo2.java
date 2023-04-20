package com.hainiu;

/**
 * 测试多态继承案例
 * @author qs
 */

public class Demo2 {
    public static void main(String[] args) {
        Animal animal = new Cat("胖圆");
        active(animal);
        Dog dog = new Dog("来福");
        active(dog);
    }

    /**
     * 定义一个方法实现摸个具体动物对象的所有行为！
     * @param a 动物对象
     */
    public static void active(Animal a) {
        a.eat();
        if(a instanceof Cat){
            ((Cat) a).miaomiao();
        }else if(a instanceof Dog){
            ((Dog) a).wangwang();
        }else {
            return;
        }
    }
}
