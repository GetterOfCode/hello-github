package com.hainiu.newP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StrToNumAndSort {
    public static void main(String[] args) {
        String str = "11 110   20  25  18  17  15  22";
        String[] split = str.split("\\s+");
        int[] nums = new int[split.length];
//        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(nums);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length;i++) {
            sb.append(nums[i]);
        }
        System.out.println(sb.toString());
    }
}
