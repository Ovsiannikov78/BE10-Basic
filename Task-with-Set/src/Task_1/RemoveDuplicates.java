package Task_1;

import java.util.*;

public class RemoveDuplicates {
    /* 1. С использованием множеств (Set) реализовать функцию,
          которая вернет список без повторяющихся элементов:
          List<String> removeDuplicates(List<String> input)
          Пример:​{“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} ->
          {“Ivan”, “Maria”, “Piotr”, “Anna”}
    */

    public static Set<String> removeDuplicates(List<String> input) {
        return new HashSet<>(input);
    }
}
