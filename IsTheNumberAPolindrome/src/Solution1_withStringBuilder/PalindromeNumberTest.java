package Solution1_withStringBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    /*
    Определить, является ли число палиндромом.
    Например 10201 или 12388321 => true
     */

    PalindromeNumber palindromeNumber = new PalindromeNumber();

    @Test
    public void testIsPalindrome_true_10201(){
        assertTrue(palindromeNumber.isPalindrome(10201));
    }
    @Test
    public void testIsPalindrome_true_12388321(){
        assertTrue(palindromeNumber.isPalindrome(12388321));
    }
    @Test
    public void testIsPalindrome_false_103201(){
        assertFalse(palindromeNumber.isPalindrome(103201));
    }
    @Test
    public void testIsPalindrome_false_3(){
        assertTrue(palindromeNumber.isPalindrome(3));
    }

}