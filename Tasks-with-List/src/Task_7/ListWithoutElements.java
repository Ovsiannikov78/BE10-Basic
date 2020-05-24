package Task_7;

import java.util.ArrayList;
import java.util.List;

public class ListWithoutElements {
    public static void main(String[] args) {

    }
      /* 7. Есть список с целыми числами. Написать функцию, которая вернет список без
            элементов, больше заданного числа.
            Если заданное число 3 -> {1, 2, 3, 4, 5} -> {1, 2}
    */

    public static List<Integer> removalElements(List<Integer> list, int n) {
        List<Integer> newList = new ArrayList<>();
        for (Integer num : list) {
            if (num < n) {
                newList.add(num);
            }
        }
        return newList;
    }
}

