import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LcmForTwoNumbersTest {

    LcmForTwoNumbers lcm = new LcmForTwoNumbers();

    @Test
    public void testFindLsmFor_6AND9_18(){
        assertEquals(18, lcm.LCM(6,9));
    }
    @Test
    public void testFindLsmFor_4AND3_12(){
        assertEquals(12, lcm.LCM(4,3));
    }
    @Test
    public void testFindLsmFor_9AND6_18(){
        assertEquals(18, lcm.LCM(9,6));
    }
    @Test
    public void testFindLsmFor_9AND1_9(){
        assertEquals(9, lcm.LCM(9,1));
    }


}