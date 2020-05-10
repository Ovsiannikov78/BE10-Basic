package List_task_3;

import java.util.ArrayList;

public class YesOrNo {
    public static void main(String[] args) {

    }
    /*  3. Есть два списка одинаковой длины с числами. Написать функцию, которая
          вернет список с элементами Yes или No, где значение на i-том месте зависит от того,
          равны ли элементы двух списков под номером i.
          Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {No, Yes, Yes, No}
    */
    public static ArrayList<String> listYesOrNo(ArrayList<Number> numbers1, ArrayList<Number> numbers2) {
        ArrayList<String> listYesOrNo = new ArrayList<>();
        for (int i = 0; i < numbers1.size(); i++) {
            if (numbers1.get(i).equals(numbers2.get(i))) {
                listYesOrNo.add("Yes");
            } else {
                listYesOrNo.add("No");
            }
        }
        return listYesOrNo;
    }
}




