public class StrAndIntNumbs {
    public static void main(String[] args) {
        numbs("sdasdas41d65asd4asd1qAAASD1561");
    }

    /**
     * 统计并分别输出字符串中字母的数量 和数字的数量
     * @param str
     */
    private static void numbs(String str){
        int strNum = 0;
        int intNum = 0;
        for (int i = 0; i < str.length(); i++){
            if(str.charAt(i) <= '9'&&str.charAt(i)>='0'){
                intNum++;
            }
            if (str.charAt(i)<='z'&&str.charAt(i)>='a'||str.charAt(i)<='Z'&&str.charAt(i)>='A'){
                strNum++;
            }
        }
        System.out.println("字母数量为："+strNum+"，数字数量为："+intNum);
    }
}
