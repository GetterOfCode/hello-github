package hash;

import java.util.HashSet;
import java.util.Scanner;

public class Hash1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> set = new HashSet<String>();
        System.out.println("请输入字符串的个数：");
        int num = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            set.add(scanner.nextLine());
        }
        System.out.println(numberOfStr(set));
    }
    private static int numberOfStr(HashSet<String> strings){
        return strings.size();
    }
}
