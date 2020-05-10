package List_task_6;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TwoListsInOneTest {

    // 6. Объединить два списка в один.

    @Test
    public void testCombiningTwoLists(){
        List<Integer> list1 = new ArrayList<>();
        Collections.addAll(list1,1,2,3,4);

        List<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,5,6,7);

        List<Integer> akt = TwoListsInOne.combiningTwoLists(list1,list2);
        List<Integer> exp = new ArrayList<>();
        Collections.addAll(exp,1,2,3,4,5,6,7);

        Assert.assertEquals(exp,akt);
    }
}
