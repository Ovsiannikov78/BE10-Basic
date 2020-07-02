package Task_2;

import java.util.*;

public class GetDuplicates {
    public static void main(String[] args) {

    }
    /*
        2. С использованием множеств реализовать функцию,
           которая вернет повторяющиеся элементы из данного списка:
           List<String> getDuplicates(List<String> input)
           Пример: ​{“Ivan”, “Maria”, “Piotr”, “Anna”, “Maria”, “Ivan”} -> {“Ivan”, “Maria”}
    */
    public static Set<String> getDuplicates(List<String> input) {
        Set<String> uniqueList = new HashSet<>();
        Set<String> duplicatesList = new HashSet<>();
        for (String name : input) {
            if (!uniqueList.add(name)) {
                duplicatesList.add(name);
            }
        }
        return duplicatesList;
    }
}
