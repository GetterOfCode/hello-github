package com.hainiu;
import java.io.*;
public class Demo1 {
    public static void main(String[] args) {
//        test1();
//        test2();
//        test3();
        test4();

    }
    private static void test4() {
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("io-demo\\mn2.jpg"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("io-demo\\mn4.jpg"));
        ){
            int len = 0;
            while((len=in.read())!=-1){
                out.write(len);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void test3() {
        try(InputStream in = new FileInputStream("io-demo\\mn.jpg");
            OutputStream out = new FileOutputStream("io-demo\\mn3.jpg");
        ){
            int len = 0;
            while((len=in.read())!=-1){
                out.write(len);
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void test2() {
        try(BufferedInputStream in = new BufferedInputStream(new FileInputStream("io-demo\\mn.jpg"));
            BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("io-demo\\mn2.jpg"));
        ){
            byte[] bytes = new byte[8192];
            int len = 0;
            while ((len = in.read(bytes))!=-1){
                out.write(bytes, 0, len);
            }

        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void test1() {
        try(FileInputStream fis = new FileInputStream("D:\\hainiu\\17 IO流\\mn.jpg");
            FileOutputStream fos = new FileOutputStream("io-demo\\mn.jpg");
        ){
            byte[] buffer = new byte[8192];
            int len = 0;
            while ((len=fis.read(buffer)) != -1){
                fos.write(buffer, 0, len);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
