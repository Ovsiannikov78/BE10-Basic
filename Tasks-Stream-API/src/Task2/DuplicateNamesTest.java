package Task2;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DuplicateNamesTest {
    /*
    2. Есть список имен, нужно написать функцию, которая вернет список имен без дупликатов.
     */

    @Test
    public void testDuplicateNames() {
        List<String> names = Arrays.asList("Roman", "Jack", "Anna", "Jack", "John", "Vlad", "Roman", "Anna");

        List<String> exp = Arrays.asList("Roman", "Jack", "Anna", "John", "Vlad");
        List<String> akt = DuplicateNames.removeDuplicateNames(names);

        Assert.assertEquals(exp, akt);
    }
}
