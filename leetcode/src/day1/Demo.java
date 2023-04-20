package day1;

public class Demo {

        public static void main(String[] args) {
            // 8种基本数据类型 都定义一个变量 并输出它们的值

            // byte
            byte b1 = -128;
            byte b2 = 127;
            System.out.println(b1);
            System.out.println(b2);
            System.out.println("----------");
            // short

            short s1 = -32768;
            short s2 = 32767;
            System.out.println(s1);
            System.out.println(s2);
            System.out.println("----------");

            // int
            int i1 = 10;
            System.out.println(i1);
            System.out.println("----------");

            // long 定义long类型的数据 为了避免数据过大 超出int范围 需要在数据的后面加L标识
            long num = 100L;
            System.out.println(num);
            System.out.println("----------");

            // float 定义float类型的数据 小数默认是double 而double的精度比float高， 需要在数据的后面加F标识
            float f1 = -1.5F;
            System.out.println(f1);
            System.out.println("----------");

            // double
            double d1 = -5.5;
            System.out.println(d1);
            double d2 = 5.5555;
            System.out.println(d2);
            System.out.println("----------");

            // char
            char c = 'a';
            System.out.println(c);
            System.out.println("----------");

            // boolean
            boolean flag1 = true;
            boolean flag2 = false;
            System.out.println(flag1);
            System.out.println(flag2);

//        System.out.println(b1);

        /*{
            int x = 10;
            System.out.println(x);
        }
        System.out.println(x);
        */

        }

    /*public static void show() {
        System.out.println(b1);
    }*/


}
