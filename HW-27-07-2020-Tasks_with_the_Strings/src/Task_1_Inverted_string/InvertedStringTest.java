package Task_1_Inverted_string;

import org.junit.Assert;
import org.junit.Test;

public class InvertedStringTest {
    /*
       Есть строка. Вернуть её перевернутый вариант
       Hello -> olleH
     */
    String str = "Hello";


    @Test
    public void invesedString() {
        String exp = "olleH";
        String akt = InvertedString.inversedString(str);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void notInvesedString() {
        String exp = str;
        String akt = InvertedString.inversedString(str);

        Assert.assertNotEquals(exp, akt);
    }
}