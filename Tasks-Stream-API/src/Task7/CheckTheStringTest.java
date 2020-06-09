package Task7;

import org.junit.Assert;
import org.junit.Test;

public class CheckTheStringTest {
    /*
        7. Написать функцию, которая проверяет, является ли заданная строка целым числом.
           Подсказка - Character.isDigit() и Stream.allMatch().
    */

    @Test
    public void testCheckTheString(){
        String str = "2356";

        boolean akt = CheckTheString.checkTheString(str);

        Assert.assertTrue(akt);
    }

    @Test
    public void testCheckTheString1(){
        String str = "23,76";

        boolean akt = CheckTheString.checkTheString(str);

        Assert.assertFalse(akt);
    }

    @Test
    public void testCheckTheString3(){
        String str = "0";

        boolean akt = CheckTheString.checkTheString(str);

        Assert.assertTrue(akt);
    }
}
