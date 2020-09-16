package Task_BalancedParenthesesValidation;

import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
        String s = "[{]}";
        System.out.println(balancedParenthesesValidationChecker(s));

    }

    public static boolean balancedParenthesesValidationChecker(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}