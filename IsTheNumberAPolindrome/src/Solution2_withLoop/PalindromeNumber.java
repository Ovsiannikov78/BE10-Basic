package Solution2_withLoop;

public class PalindromeNumber {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(int num){
        char[] numbers = String.valueOf(num).toCharArray();
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != numbers[numbers.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
