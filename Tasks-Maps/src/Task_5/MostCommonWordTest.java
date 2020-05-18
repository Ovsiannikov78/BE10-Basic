package Task_5;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWordTest {
/*
    5. Дан текст, подсчитать, какое слово встречается больше остальных.
       Слова в предложениях могут разделяться запятыми, точками, пробелами.
       Предлоги [в, на, из, под] и остальные не учитывать при подсчете.
*/

    @Test
    public void testMostCommonWord(){
        String text = " Ехал Грека через реку, \n" +
                "Видит Грека - в реке рак. \n" +
                "Сунул Грека руку в реку, \n" +
                "Рак за руку Грека - цап! ";

        Map<String,Integer> akt = MostCommonWord.findMostCommonWord(text);
        Map<String,Integer> exp = new HashMap<>();
        exp.put( "Грека", 4);

        Assert.assertEquals(exp,akt);
    }
}
