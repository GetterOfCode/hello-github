package day1;
public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x){
        String oldX = Integer.toString(x);
        System.out.println(oldX);
        StringBuilder stringBuilder = new StringBuilder(oldX);
        String newX = stringBuilder.reverse().toString();
        System.out.println(newX);
        if(oldX.equals(newX)){
            return true;
        }
        return false;
    }
}
