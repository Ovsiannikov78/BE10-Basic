package List_task_4;

import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class CircularVersionOfListTest {

    /*  4. Есть два списка с буквами. Определить, является ли один список циклической версией другого.
         Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb} результат будет true,
         а для {dd, ee, ff} и {dd, ff, ee} - false.
   */

    @Test
    public void testCircularVersionOfListTest(){
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1,"aa", "bb", "cc","dd");

        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "cc", "dd", "aa", "bb");

        boolean akt = CircularVersionOfList.circularVersionOfList(list1,list2);

        Assert.assertTrue(akt);
    }

    @Test
    public void testCircularVersionOfListTest1(){
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1,"dd", "ee", "ff");

        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2, "dd", "ff", "ee");

        boolean akt = CircularVersionOfList.circularVersionOfList(list1,list2);

        Assert.assertFalse(akt);
    }
}
