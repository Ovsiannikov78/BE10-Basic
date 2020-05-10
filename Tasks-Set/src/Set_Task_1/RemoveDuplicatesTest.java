package Set_Task_1;

import org.junit.Assert;
import org.junit.Test;


import java.util.*;

public class RemoveDuplicatesTest {

  /*  1. С использованием множеств (Set) реализовать функцию, которая вернет список без повторяющихся элементов:
          List<String> removeDuplicates(List<String> input)
          Пример:​{“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} ->
          {“Ivan”, “Maria”, “Piotr”,“Anna”}
   */


    @Test
    public void testRemoveDuplicates(){
        List<String> input = new ArrayList<>();
        Collections.addAll(input,"Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");

        LinkedHashSet<String> exp = new LinkedHashSet<>();
        Collections.addAll(exp,"Ivan", "Maria", "Piotr", "Anna");

        Set<String> akt = RemoveDuplicates.removeDuplicates(input);

        Assert.assertEquals(exp,akt);
    }
}


