package Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.junit.Assert;
import org.junit.Test;

public class TrueOrFalseTest {
    /* 2. Дан массив букв, вернуть мапу Map<String, Boolean> где каждая строка является ключем,
          а значением true, если строка в массиве больше одного раза и false, если только один раз.
          Примеры:
          wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
          wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
          wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */

    @Test
    public void TrueOrFalse1() {
        List<String> list = new ArrayList();
        Collections.addAll(list, "a", "b", "a", "c", "b");
        Map<String, Boolean> exp = new TreeMap();
        exp.put("a", true);
        exp.put("b", true);
        exp.put("c", false);
        Map<String, Boolean> akt = TrueOrFalse.trueOrFalse(list);
        Assert.assertEquals(exp, akt);
    }

    @Test
    public void TrueOrFalse2() {
        List<String> list = new ArrayList();
        Collections.addAll(list, "c", "b", "a");
        Map<String, Boolean> exp = new TreeMap();
        exp.put("a", false);
        exp.put("b", false);
        exp.put("c", false);
        Map<String, Boolean> akt = TrueOrFalse.trueOrFalse(list);
        Assert.assertEquals(exp, akt);
    }

    @Test
    public void TrueOrFalse3() {
        List<String> list = new ArrayList();
        Collections.addAll(list, "c", "c", "c", "c");
        Map<String, Boolean> exp = new TreeMap();
        exp.put("c", true);
        Map<String, Boolean> akt = TrueOrFalse.trueOrFalse(list);
        Assert.assertEquals(exp, akt);
    }
}
