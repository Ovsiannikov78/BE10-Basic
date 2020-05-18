package Task_4;

import java.util.*;

public class NumberOfEntriesByName {
    public static void main(String[] args) {

    }

    /* 4. Дан список имен, где некоторые имена повторяются.
         Написать функцию, которая по имени вернет количество вхождений этого имени в список.

    public static int numberOfEntriesByName(List<String> namesList, String givenName){   // решение через Collections
        return Collections.frequency(namesList, givenName);
    }
    */
    public static Map<String, Integer> numberOfEntriesByName(List<String> namesList, String givenName) {
        Map<String, Integer> map = new HashMap<>();
         if(namesList.contains(givenName)) {
             for (String name : namesList) {
                 if (map.containsKey(name)) {
                     map.put(name, map.get(name) + 1);
                 } else {
                     map.put(name, 1);
                 }
             }
         }
        return map;
    }
}