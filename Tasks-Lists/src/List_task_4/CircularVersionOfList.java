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

  public static boolean circularVersionOfList(List<String> list1,List<String> list2){
      if(list1.size() % 2 == 0) {
          Collections.rotate(list1, 2);
          return list1.equals(list2);
      }
      return false;
  }
}

