package Task6;

import org.junit.Assert;
import org.junit.Test;

public class CountingWordsByLetterTest {

    /*
        6. Написать функцию, которая принимает предложение,
           а возвращает количество слов, начинающихся на заданную букву.
     */

    @Test
    public void testCountingWordsByLetter(){
        String letter = "р";
        String str = "Ехал Грека через реку, видит Грека в реке рак";

        Integer exp = 3;
        Integer akt = CountingWordsByLetter.countWords(str,letter);

        Assert.assertEquals(exp,akt);
    }
    @Test
    public void testCountingWordsByLetter1(){
        String letter = "Г";
        String str = "Ехал Грека через реку, видит Грека в реке рак";

        Integer exp = 2;
        Integer akt = CountingWordsByLetter.countWords(str,letter);

        Assert.assertEquals(exp,akt);
    }

}
