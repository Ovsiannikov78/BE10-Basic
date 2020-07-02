package Task_6;

import java.util.ArrayList;
import java.util.List;

public class TwoListsInOne {

    public static void main(String[] args) {

    }
    // 6. Объединить два списка в один.

    public static List<Integer> combiningTwoLists(List<Integer> list1, List<Integer> list2 ){
        List<Integer> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }
}