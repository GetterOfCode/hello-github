package day1;

public class LengthOfSubString {
    public static void main(String[] args) {
        int helliollsdad = lengthOfLongestSubstring("jjjjjjjjjjjj");
        System.out.println(helliollsdad);
    }
    public static int lengthOfLongestSubstring(String s){
        int maxLength = 1;
        if(s == null || s.length() == 0){
            return 0;
        }
        int i = 0;
        int j = 1;
        int length = 0;
        while(j!= s.length()){
            for(int k = i;k<j;k++){
                if(s.charAt(k) ==s.charAt(j)){
                    length = j-i;
                    i = k+1;
                    break;
                }else{
                    length = j-i+1;
                }
            }
            if(length>maxLength){
                maxLength = length;
            }
            j++;
        }

        return maxLength;
    }
}
