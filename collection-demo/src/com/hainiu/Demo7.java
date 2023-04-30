package com.hainiu;
/**
 *  括号匹配校验
 *  author: qishuo
 *  从左向右遍历字符串，检查每一个匹配的括号，发现一个左括号，入栈一个右括号，
 *  遍历到右括号 出栈栈顶匹配 不匹配 或者最后未完全出栈 或者 遍历到的右括号没有与之匹配的栈顶元素
 */

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
