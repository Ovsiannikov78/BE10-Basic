package Task_4;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class NumberOfEntriesByNameTest {
/*
    4. Дан список имен, где некоторые имена повторяются.
         Написать функцию, которая по имени вернет количество вхождений этого имени в список.
*/

    @Test
    public void NumberOfEntriesByName(){
        String givenName = "Ivan";
        List<String> namesList = new  ArrayList<>();
        Collections.addAll(namesList,"Ivan", "Maria","Ivan", "Stephan","John","Amalia","Ivan","John");

        Map<String, Integer> exp = new HashMap<>();
        exp.put("Ivan", 3);
        Map<String, Integer> akt = NumberOfEntriesByName.numberOfEntriesByName(namesList, givenName);
        Assert.assertEquals(exp.get(givenName),akt.get(givenName));
    }

    @Test
    public void NumberOfEntriesByName1(){
        String givenName = "Viktor";
        List<String> namesList = new  ArrayList<>();
        Collections.addAll(namesList,"Ivan", "Maria","Ivan", "Stephan","John","Amalia","Ivan","John");

        Map<String, Integer> exp = new HashMap<>();
        // Здесь пустая map, так как мы ожидаем что на вуходе из метода будет пустая map,
        //  так как ожидаемого имени в списке нет.
        Map<String, Integer> akt = NumberOfEntriesByName.numberOfEntriesByName(namesList, givenName);
        Assert.assertEquals(exp,akt);
    }
}
