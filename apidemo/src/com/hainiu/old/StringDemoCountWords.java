package com.hainiu.old;

import java.util.Scanner;
public class StringDemoCountWords {
    public static void main(String[] args) {
        System.out.println("请输入一段文本:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println("请输入所要查找的单词：");
        String word = scanner.nextLine();
        if (text != null&word != null) {
            int count = countWords2(text,word);
            System.out.println("所要查找的单词数为:"+count);
        }else {
            System.out.println("文本和所要查找的内容不能为空！");
        }
    }
    /**
     *
     * @param text 文本
     * @param word 所要查找的单词
     * @return 返回所要查找的单词数
     */
    private static int countWords(String text, String word) {
        int count = 0;
        int i = text.indexOf(word);
        while (i != -1) {
            count++;
            i = text.indexOf(word,i+word.length());
        }
        return count;
    }

    /**
     * 截取加查找
     * @param text
     * @param word
     * @return
     */
    private static int countWords2(String text, String word){
        int count = 0;
        int i ;
        while ((i = text.indexOf(word))!= -1) {
            count++;
//            i = text.indexOf(word,i+word.length());

            text = text.substring(i+word.length()-1);

        }
        return count;
    }
}
