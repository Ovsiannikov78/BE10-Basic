package Task_4;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberOfEntriesByNameTest {

   /* 4. Дан список имен, где некоторые имена повторяются.
         Написать функцию, которая по имени вернет количество вхождений этого имени в список.
    */

    @Test
    public void NumberOfEntriesByName(){
        String givenName = "Ivan";
        List<String> namesList = new  ArrayList<>();
        Collections.addAll(namesList,"Ivan", "Maria","Ivan", "Stephan","John","Amalia","Ivan","John");

        int exp = 3;
        int akt = NumberOfEntriesByName.numberOfEntriesByName(namesList, givenName);
        Assert.assertEquals(exp,akt);
    }

    @Test
    public void NumberOfEntriesByName1(){
        String givenName = "Viktor";
        List<String> namesList = new  ArrayList<>();
        Collections.addAll(namesList,"Ivan", "Maria","Ivan", "Stephan","John","Amalia","Ivan","John");

        int exp = 0;
        int akt = NumberOfEntriesByName.numberOfEntriesByName(namesList, givenName);
        Assert.assertEquals(exp,akt);
    }
}
