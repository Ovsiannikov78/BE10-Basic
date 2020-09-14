package Task_BalancedParenthesesValidation;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;


public class Solution {
    public static void main(String[] args) {
        String s = "[{}([[]])]{}";
        System.out.println(determinateOrderOfCharacters(s));
    }

    public static boolean determinateOrderOfCharacters(String s) {
        Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(')
                stack.push(')');
            else if (ch == '{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != ch)
                return false;
        }
        return stack.isEmpty();
    }
}



