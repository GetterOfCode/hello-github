package day4;

import java.util.ArrayList;
import java.util.HashMap;

import static sun.java2d.cmm.ColorTransform.In;

public class GetLucky {
    public static void main(String[] args) {

        System.out.println(getLucky("iiiii",2));

    }
    private static int getLucky(String s, int k) {
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for (int i = 1; i <=26;i++){
            hashMap.put(new Character((char)(96+i)),i);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            sb.append(hashMap.get(c).toString());
        }
        String s1 = sb.toString();


        for (int i = 0; i < k; i++) {
            int temp = 0;
            for (int j = 0; j <s1.length(); j++) {
                temp += Integer.parseInt(String.valueOf(s1.charAt(j)));
            }
            s1 = String.valueOf(temp);

        }
        return Integer.valueOf(s1);

    }
}
