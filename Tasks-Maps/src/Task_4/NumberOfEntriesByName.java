package Task_4;

import java.util.Collections;
import java.util.List;

public class NumberOfEntriesByName {
    public static void main(String[] args) {

    }
    /* 4. Дан список имен, где некоторые имена повторяются.
         Написать функцию, которая по имени вернет количество вхождений этого имени в список.
    */

    public static int numberOfEntriesByName(List<String> namesList, String givenName){
        return Collections.frequency(namesList, givenName);
    }
}
