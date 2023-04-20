package com.hainiu.newP;

public class HuiWen {
    public static void main(String[] args) {
        boolean huiWen = isHuiWen("  123321");
        System.out.println(huiWen);
    }
    private static boolean isHuiWen(String str){
        if(str == null||str == ""){
            return false;
        }
        str = str.trim();
//        str = str.trim();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}
