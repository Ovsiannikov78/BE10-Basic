package Set_Task_2;

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
        Set<String> uniqueList = new LinkedHashSet<>();
        Set<String> duplicatesList = new LinkedHashSet<>();
        for (String a : input) {
            if (!uniqueList.add(a)) {
                duplicatesList.add(a);
            }
        }
        return duplicatesList;
    }
}
