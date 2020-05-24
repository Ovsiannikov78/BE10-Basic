package Task_3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class YesOrNoTest {

   /*  3. Есть два списка одинаковой длины с числами. Написать функцию, которая
          вернет список с элементами Yes или No, где значение на i-том месте зависит от того,
          равны ли элементы двух списков под номером i.
          Например, {1, 2, 3, 4} и {5, 2, 3, 8} вернет {No, Yes, Yes, No}
    */

    @Test
    public void testYesOrNo(){
        ArrayList<Number> numbers1 = new ArrayList<>();
        Collections.addAll(numbers1,1,2,3,4);

        ArrayList<Number> numbers2 = new ArrayList<>();
        Collections.addAll(numbers2,5,2,3,8);

        ArrayList<String> akt = YesOrNo.listYesOrNo(numbers1,numbers2);
        ArrayList<String> exp = new ArrayList<>();
        Collections.addAll(exp,"No","Yes","Yes","No");

        Assert.assertEquals(exp,akt);
    }
}