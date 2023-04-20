package day5;

import java.util.Arrays;

public class MinPartitions {
    public static void main(String[] args) {
        System.out.println(minPartitions("20900006156"));

    }
    private static int minPartitions(String n) {
//        int[] nums = new int[n.length()];
//        for (int i = 0; i < n.length(); i++) {
//            nums[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
//        }
//        return Arrays.stream(nums).max().getAsInt();
        if(n.contains("9")){
            return 9;
        }else if(n.contains("8")){
            return 8;
        }else if(n.contains("7")){
            return 7;
        }else if(n.contains("6")){
            return 6;
        }else if(n.contains("5")){
            return 5;
        }else if(n.contains("4")){
            return 4;
        }else if(n.contains("3")){
            return 3;
        }else if(n.contains("2")){
            return 2;
        }else if(n.contains("1")){
            return 1;
        }else {
            return 0;
        }
    }
}
