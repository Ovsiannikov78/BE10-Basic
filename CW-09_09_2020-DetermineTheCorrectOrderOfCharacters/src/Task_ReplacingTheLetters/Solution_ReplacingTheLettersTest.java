package Task_ReplacingTheLetters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Solution_ReplacingTheLettersTest {

    @Test
    public void testReplacingTheLetters_from_AvcBF_to_aVCbf(){
        String str = "AvcBF";
        String exp = "aVCbf";
        String akt = Solution_ReplacingTheLetters.replacingTheLetters(str);
        Assertions.assertEquals(exp,akt);
    }
    @Test
    public void testReplacingTheLetters_from_ABCDefg_to_abcdEFG(){
        String str = "ABCDefg";
        String exp = "abcdEFG";
        String akt = Solution_ReplacingTheLetters.replacingTheLetters(str);
        Assertions.assertEquals(exp,akt);
    }
    @Test
    public void testReplacingTheLetters_from_ABCD_to_abcd(){
        String str = "ABCD";
        String exp = "abcd";
        String akt = Solution_ReplacingTheLetters.replacingTheLetters(str);
        Assertions.assertEquals(exp,akt);
    }
    @Test
    public void testReplacingTheLetters_from_abcd_to_ABCD(){
        String str = "abcd";
        String exp = "ABCD";
        String akt = Solution_ReplacingTheLetters.replacingTheLetters(str);
        Assertions.assertEquals(exp,akt);
    }




}