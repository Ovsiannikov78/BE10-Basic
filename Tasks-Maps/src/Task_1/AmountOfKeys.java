package Task_1;

import java.util.HashMap;
import java.util.Map;

public class AmountOfKeys {
    public static void main(String[] args) {

    }
/* 1. Дана Map<String, String> map, написать функцию, которая вернет Мап,
      такую, если в исходной map есть ключ ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’ с суммой значений от ключей a и b.
      Примеры:
      mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
      mapAB({"a": "Hi"}) → {"a": "Hi"}
      mapAB({"b": "There"}) → {"b": "There"}
*/

    public static Map<String, String> newMap(Map<String, String> hashMap) {
        if (hashMap.containsKey("a") && hashMap.containsKey("b")) {
            hashMap.put("ab", "HiThere");
        }
        return hashMap;
    }
}
