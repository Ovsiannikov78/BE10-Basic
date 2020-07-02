package Task_2;

import java.util.List;

/* 2. Есть список с именами: I​van, Maria, Stephan, John, Amalia.​Написать функцию,
         которая вернет список, в котором не содержатся имена исходного списка,
          длиной 4.
    */
public class NameList {
    public static void main(String[] args) {

    }
    public static List<String> removeTheNameFromTheList(List<String> names){
        names.removeIf(str -> str.length() == 4);
        return names;
    }
}
