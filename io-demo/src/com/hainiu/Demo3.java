package com.hainiu;

import java.io.*;

public class Demo3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        test1();
        test2();

    }

    /**
     * 反序列化
     * @throws IOException
     * @throws ClassNotFoundException
     */

    private static void test2() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("io-demo\\c.txt"));
//        Object o = ois.readObject();
//        System.out.println(o);
        while(true){
            try{
                Object o = ois.readObject();
                System.out.println(o);
            }catch (EOFException e){
//                System.out.println(e.getMessage());;
                break;
            }

        }

    }

    /**
     * 序列化
     * @throws IOException
     */

    private static void test1() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("io-demo\\c.txt",true));
        oos.writeObject(new Student("tom",18,185));
        oos.writeObject(new Student("tom",18,185));
        oos.writeObject(new Student("tom",18,185));
        oos.writeObject(new Student("tom",18,185));

        oos.close();
    }
}
