package List_task_2;

import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class NameListTest {

    /* 2. Есть список с именами: I​van, Maria, Stephan, John, Amalia.​Написать функцию,
          которая вернет список, в котором не содержатся имена  из исходного списка, длинной 4.

     */

    @Test
    public void testRemoveTheNameFromTheList() {
        List<String> names = new LinkedList<>();
        Collections.addAll(names,"Ivan", "Maria", "Stephan","John","Amalia");

        List<String> exp = new LinkedList<>();
        Collections.addAll(exp,"Maria", "Stephan","Amalia");

        List<String> akt = NameList.removeTheNameFromTheList(names);
        assertEquals(exp, akt);
    }
}
