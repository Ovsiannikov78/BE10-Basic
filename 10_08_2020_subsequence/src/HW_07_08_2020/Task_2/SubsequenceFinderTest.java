package HW_07_08_2020.Task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubsequenceFinderTest {

    SubsequenceFinder finder = new SubsequenceFinder();

    @Test
    public void  testIsSubsequence_emptyPatternEmptyText_true(){
        assertTrue(finder.isSubsequence(""," 9"));
    }
    @Test
    public void  testIsSubsequence_emptyPatternAnyText_true(){
        assertTrue(finder.isSubsequence(""," 9"));
    }
    @Test
    public void  testIsSubsequencePatternAndText_false(){
        assertFalse(finder.isSubsequence("a"," 9"));
    }
    @Test
    public void  testIsSubsequencePatternEmptyText_false(){
        assertFalse(finder.isSubsequence("a"," a9"));
    }
    @Test
    public void  testIsSubsequencePatternAndMixedText_false(){
        assertFalse(finder.isSubsequence("abcs"," sdfavdfvb;lkcooo"));
    }
    @Test
    public void  testIsSubsequencePatternAndMixedText_true(){
        assertTrue(finder.isSubsequence("abcs"," sdfavdfvb;lkcooso"));
    }

}