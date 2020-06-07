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
}
