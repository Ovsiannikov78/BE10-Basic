package Task_ReplacingTheLetters;

public class Solution_ReplacingTheLetters {
    public static void main(String[] args) {
        /**
         * Replace all lower-case characters in a given string with upper-case and vice-versa.
         */

    }
    public static String replacingTheLetters(String str){
        StringBuilder modifiedStr = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                modifiedStr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
            }else{
                modifiedStr.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            }
        }
        return modifiedStr.toString();
    }
}
