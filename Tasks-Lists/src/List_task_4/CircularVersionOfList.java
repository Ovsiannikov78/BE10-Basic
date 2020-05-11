package List_task_4;

import java.util.Collections;
import java.util.List;

public class CircularVersionOfList {
    /*  4. Есть два списка с буквами. Определить, является ли один список циклической версией другого.
           Например, для списков {aa, bb, cc, dd} и {cc, dd, aa, bb} результат будет true,
           а для {dd, ee, ff} и {dd, ff, ee} - false.
     */
    public static void main(String[] args) {

    }

    public static boolean circularVersionOfList(List<String> list1, List<String> list2) {
        if (list1.size() == list2.size()) {
            for (int i = list1.size(); i >= 0; i--) {
                Collections.rotate(list1, 1);
                if (list1.equals(list2)) {
                    return true;
                }
            }
        }
        return false;
    }
}




