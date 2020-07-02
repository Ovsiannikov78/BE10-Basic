package Task_2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TrueOrFalse {

    /* 2. Дан массив букв, вернуть мапу Map<String, Boolean> где каждая строка является ключем,
          а значением true, если строка в массиве больше одного раза и false, если только один раз.
          Примеры:
          wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
          wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
          wordMultiple(["c", "c", "c", "c"]) → {"c": true}
     */


    public static void main(String[] args) {
    }

    public static Map<String, Boolean> trueOrFalse(List<String> list) {
        Map<String, Boolean> map = new LinkedHashMap();

        for(int i = 0; i < list.size(); ++i) {
            map.computeIfPresent(list.get(i), (k, v) -> true);
            map.putIfAbsent(list.get(i), false);
        }
        return map;
    }
}
