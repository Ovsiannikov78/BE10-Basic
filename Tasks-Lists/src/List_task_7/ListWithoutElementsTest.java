package List_task_7;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListWithoutElementsTest {

   /* 7. Есть список с целыми числами. Написать функцию, которая вернет список без
         элементов, больше заданного. Если заданное число 3 -> {1, 2, 3, 4, 5} -> {1, 2}
   */
    @Test
    public void ListWithoutElements(){
        int n = 3;
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);

        List<Integer> exp = new ArrayList<>();
        Collections.addAll(exp,1,2);

        List<Integer> akt = ListWithoutElements.removalElements(list,n);

        Assert.assertEquals(exp,akt);
    }
}




