package Task_ReplacingTheLetters;

public class Solution {
    public static void main(String[] args) {
    }

    public static String replacingTheLetters(String str) {
        StringBuilder modifiedStr = new StringBuilder(str);

        for (int i = 0; i < str.length(); ++i) {
            if (Character.isLowerCase(str.charAt(i))) {
                modifiedStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            } else {
                modifiedStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        return modifiedStr.toString();
    }
}