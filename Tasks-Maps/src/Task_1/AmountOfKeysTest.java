package Task_1;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class AmountOfKeysTest {

  /*   1. Дана Map<String, String> map, написать функцию, которая вернет Мап,
      такую, если в исходной map есть ключ ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.
      Примеры:
      mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
      mapAB({"a": "Hi"}) → {"a": "Hi"}
      mapAB({"b": "There"}) → {"b": "There"}
 */

    @Test
    public void testAmountOfKeys1() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "Hi");
        hashMap.put("b", "There");

        Map<String, String> exp = new HashMap<>();
        exp.put("a", "Hi");
        exp.put("ab", "HiThere");
        exp.put("b", "There");

        Map<String, String> akt = AmountOfKeys.newMap(hashMap);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testAmountOfKeys2() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "Hi");

        Map<String, String> exp = new HashMap<>();
        exp.put("a", "Hi");

        Map<String, String> akt = AmountOfKeys.newMap(hashMap);
        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testAmountOfKeys3() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("b", "There");

        Map<String, String> exp = new HashMap<>();
        exp.put("b", "There");

        Map<String, String> akt = AmountOfKeys.newMap(hashMap);
        Assert.assertEquals(exp, akt);
    }
}
