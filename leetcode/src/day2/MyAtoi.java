package day2;

public class MyAtoi {


    public static void main(String[] args) {
        int i = myAtoi("  -29948949494  ");
        System.out.println(i);
    }
    public static int myAtoi(String s) {
        if(s.length() == 0 || s == null){
            return 0;
        }
        String afterTrim = s.trim();
        StringBuilder  stringBuilder= new StringBuilder();
//        int length = stringBuilder.length();
        int sign = 1;
        if (afterTrim.length() == 0) {
            return 0;
        }else if (afterTrim.charAt(0) == '-') {
            sign = -1;
            afterTrim = afterTrim.substring(1);
            if (afterTrim.length() == 0 ||!(afterTrim.charAt(0) <='9' && afterTrim.charAt(0)>='0')){
                return 0;
            }
        }else if(afterTrim.charAt(0) == '+'){
            afterTrim = afterTrim.substring(1);
            if (afterTrim.length() == 0 ||!(afterTrim.charAt(0) <='9' && afterTrim.charAt(0)>='0')){
                return 0;
            }

        }
        if (afterTrim.length() == 0) {
            return 0;
        }
//        long max = 2147483648;
        int i = 0;
        while(i<afterTrim.length()&&afterTrim.charAt(i) <='9' && afterTrim.charAt(i)>='0') {
            stringBuilder.append(afterTrim.charAt(i));
            if (sign == -1 && (-1*Long.valueOf(stringBuilder.toString())<=-2147483648)){
                return -2147483648;
            }else if(Long.valueOf(stringBuilder.toString())>2147483647){
                return 2147483647;
            }
            i++;
        }
        return i == 0? 0:Integer.valueOf(stringBuilder.toString())*sign;

    }
}
