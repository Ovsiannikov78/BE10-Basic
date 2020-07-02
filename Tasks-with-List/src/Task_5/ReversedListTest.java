package Task_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ReversedListTest {
    /*5. Написать функцию, которая реверсирует список,
         возвращает список элементов в обратном порядке.
          {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}
     */
    @Test
    public void testReversedList(){
        List<Integer> originalList = new ArrayList<>();
        Collections.addAll(originalList,1,2,3,4,5);

        List<Integer> exp = new ArrayList<>();
        Collections.addAll(exp,5,4,3,2,1);

        List<Integer> akt = ReversedList.reversedListOfNumbers(originalList);
        Assert.assertEquals(exp,akt);
    }
}