package com.hainiu;

import java.util.Stack;
public class Demo7 {
    public static void main(String[] args) {
        String str = "(((((()))))wweq){ewq{wewq}}[][[]{}[][][][][][][]]";
        System.out.println(isOk(str));
    }
    private static boolean isOk(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i)=='{'){
                stack.push('}');
            }
            if (str.charAt(i)=='['){
                stack.push(']');
            }
            if (str.charAt(i)=='('){
                stack.push(')');
            }
            if(str.charAt(i)=='}'){
                if (stack.isEmpty()||stack.peek() != '}'){
                    return false;
                }
                stack.pop();
            }
            if(str.charAt(i)==')'){
                if (stack.isEmpty()||stack.peek()!=')'){
                    return false;
                }
                stack.pop();
            }
            if(str.charAt(i)==']' ){
                if (stack.isEmpty()||stack.peek()!=']'){
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.size()!=0){
            return false;
        }
        return true;
    }
}
