package Solution1_withStringBuilder;

public class PalindromeNumber {
    public static void main(String[] args) {

    }

    public boolean isPalindrome(Integer num){
        String original = Integer.toString(num);
        return new StringBuilder(original).reverse().toString().equals(original);
    }
}
