package com.allron.javalearn;

import com.allron.javalearn.Test02;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ***
 *
 * @author Allron
 * @date 2021/2/17
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(54%7);
    }

    public static boolean isValid(String s){
        // 括号之间的对应规则
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (mappings.containsKey(chars[i])) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }

    private static void toReverse(String value){
        char[] c = value.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<c.length;i++){
            stack.push(c[i]);
        }
        for(int i = 0;i<3;i++){
            System.out.print(stack.pop());
        }
    }
}
