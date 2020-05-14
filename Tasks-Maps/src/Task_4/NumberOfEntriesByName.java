package Task_4;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfEntriesByName {
    public static void main(String[] args) {

    }

    /* 4. Дан список имен, где некоторые имена повторяются.
         Написать функцию, которая по имени вернет количество вхождений этого имени в список.

    public static int numberOfEntriesByName(List<String> namesList, String givenName){   // решение через Collections
        return Collections.frequency(namesList, givenName);
    }
    */
    public static int numberOfEntriesByName(List<String> namesList, String givenName) {
        int numberOfEntries = 0;
        Map<String, Integer> map = new HashMap<>();
        for (String name : namesList) {
            if (name.equals(givenName)) {
                map.put(givenName, numberOfEntries);
                numberOfEntries++;
            } else {
                map.put(givenName, numberOfEntries);
            }
        }
        return map.get(givenName);
    }
}