package com.hainiu.newP;

/**
 * 找最长字符串大小写字母和空格
 */
public class SearchLongestStr {
    public static void main(String[] args) {
        String search = search("  13sadasda1546  AAA4564  ");
        System.out.println(search);
    }
    /**
     * 寻找最长符合要求字符串的方法
     * @param str 传入的字符串 需要在里面寻找符合要求的最长字串
     * @return 返回符合要求的最长字串
     */
    private static String search(String str){
        int count = 0;
        int max = 0;
        StringBuilder sb = new StringBuilder();
        String lString = null;
        for(int i = 0; i < str.length(); i++){
            //条件控制语句
            if((str.charAt(i)<='z'&&str.charAt(i)>='a')||(str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)==' ')){
                count++;
                sb.append(str.charAt(i));
            }else{
                //如果当前存的符合要求的字符子串是最长的 就把他保存一下 并记录长度max 便于后面比较
                if (count>max){
                    max = count;
                    lString = sb.toString();
                }
                //清空本次记录的stringBuilder 并把记录长的得计数器置零
                sb.delete(0,count);
                count = 0;
            }
        }
        return lString;
    }
}
