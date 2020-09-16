package Task_ReplacingTheLetters;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {

    @Test
    public void testReplacingTheLetters_from_AvcBF_to_aVCbf() {
        String str = "AvcBF";
        String exp = "aVCbf";
        String akt = Solution.replacingTheLetters(str);
        Assertions.assertEquals(exp, akt);
    }

    @Test
    public void testReplacingTheLetters_from_ABCDefg_to_abcdEFG() {
        String str = "ABCDefg";
        String exp = "abcdEFG";
        String akt = Solution.replacingTheLetters(str);
        Assertions.assertEquals(exp, akt);
    }

    @Test
    public void testReplacingTheLetters_from_ABCD_to_abcd() {
        String str = "ABCD";
        String exp = "abcd";
        String akt = Solution.replacingTheLetters(str);
        Assertions.assertEquals(exp, akt);
    }

    @Test
    public void testReplacingTheLetters_from_abcd_to_ABCD() {
        String str = "abcd";
        String exp = "ABCD";
        String akt = Solution.replacingTheLetters(str);
        Assertions.assertEquals(exp, akt);
    }
}