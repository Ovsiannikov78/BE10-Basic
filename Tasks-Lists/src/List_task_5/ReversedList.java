package List_task_5;
import java.util.Collections;
import java.util.List;

public class ReversedList {
    public static void main(String[] args) {

    }
    /*5. Написать функцию, которая реверсирует список,
        возвращает список элементов в обратном порядке.
         {1, 2, 3, 4, 5} -> {5, 4, 3, 2, 1}
    */
    public static List<Integer> reversedListOfNumbers(List<Integer> originalList){
        Collections.reverse(originalList);
        return originalList;
    }
}
