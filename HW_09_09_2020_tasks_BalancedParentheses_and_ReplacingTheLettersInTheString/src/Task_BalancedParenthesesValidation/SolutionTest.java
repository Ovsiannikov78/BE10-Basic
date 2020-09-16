package Task_BalancedParenthesesValidation;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class SolutionTest {

    @Test
    public void testArrangementsOfTheBrackets_true_1() {
        String s = "[]";
        assertTrue(Solution.balancedParenthesesValidationChecker(s));
    }

    @Test
    public void testArrangementsOfTheBrackets_true_2() {
        String s = "([])";
        assertTrue(Solution.balancedParenthesesValidationChecker(s));
    }

    @Test
    public void testArrangementsOfTheBrackets_true_3() {
        String s = "[{}([[]])]";
        assertTrue(Solution.balancedParenthesesValidationChecker(s));
    }

    @Test
    public void testArrangementsOfTheBrackets_true_4() {
        String s = "[{}([[]])]{}";
        assertTrue(Solution.balancedParenthesesValidationChecker(s));
    }

    @Test
    public void testArrangementsOfTheBrackets_false_1() {
        String s = "[{]}";
        assertFalse(Solution.balancedParenthesesValidationChecker(s));
    }

    @Test
    public void testArrangementsOfTheBrackets_false_2() {
        String s = "[{}([[]])]{";
        assertFalse(Solution.balancedParenthesesValidationChecker(s));
    }

    @Test
    public void testArrangementsOfTheBrackets_false_3() {
        String s = "[]{}((";
        assertFalse(Solution.balancedParenthesesValidationChecker(s));
    }

    @Test
    public void testArrangementsOfTheBrackets_false_4() {
        String s = "[}";
        assertFalse(Solution.balancedParenthesesValidationChecker(s));
    }

    @Test
    public void testArrangementsOfTheBrackets_false_5() {
        String s = "((})";
        assertFalse(Solution.balancedParenthesesValidationChecker(s));
    }
}