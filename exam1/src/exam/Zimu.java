package exam;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Zimu {
    public static void main(String[] args) {
        //HashMap存
        HashMap<Character,Integer> hashMap = new HashMap<>();
        System.out.println("请输入一段文本：");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        //循环存储
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                //键相同 个数迭加
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i))+1);
            }else {
                //没有就存 个数为1
                hashMap.put(s.charAt(i), 1);
            }
        }
        TreeMap<Character,Integer> treeMap = new TreeMap<>();
        //转成treeMap自然排序
        hashMap.forEach((k,v)->treeMap.put(k,v));
//        hashMap.forEach((k,v)-> System.out.println(k+""+v));
        //换行输出
        treeMap.forEach((k,v)-> System.out.println(k+" :"+v));


    }
}
