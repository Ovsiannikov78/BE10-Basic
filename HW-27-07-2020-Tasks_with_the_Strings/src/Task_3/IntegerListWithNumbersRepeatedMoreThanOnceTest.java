package Task_3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class IntegerListWithNumbersRepeatedMoreThanOnceTest {
    List<Integer> integerList = Arrays.asList(-8, 1, -5, 1, 2, 7, 2, 1);

    /*
      Есть List<Integer>. Вернуть новый список, содержащий по одному разу
      только те числа, которые повторяються более 1 раза;
      {-8,1,-5,1,2,7,2,1} -> {1,2} или {2,1}
    */

    @Test
    public void correctlyWorkingMethod() {
        List<Integer> exp = Arrays.asList(1, 2);
        List<Integer> akt = IntegerListWithNumbersRepeatedMoreThanOnce.listOfNumbersRepeatedMoreThanOnce(integerList);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void incorrectlyWorkingMethod() {
        List<Integer> exp = Arrays.asList(1, 2, 2, 1);
        List<Integer> akt = IntegerListWithNumbersRepeatedMoreThanOnce.listOfNumbersRepeatedMoreThanOnce(integerList);

        Assert.assertNotEquals(exp, akt);
    }
}