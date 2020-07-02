package Task_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class AnagramOfNameTest {


     /*    Анаграмма слова x - слово, по длине равное x и состоящее из таких же букв, что и x.
           Например, слово “vani” является анаграммой слова “ivan”, а слова “naan” и “anan” являются анаграммами слова “anna”.
           Дан словарь, содержащий анаграммы, например ;
           public static String[] list = {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
           Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.
           Например, по слову “ivan” функция вернет
           "ivan" -> {"ivan", "navi", "vani"}
     */


    @Test
    public void AnagramOfName() {
        String name = "ivan";
        String[] anagrams = {"anna", "ivan", "naan", "vani", "piotr", "nana", "navi"};

        List<String> arrayOfNamesForExpectedMap = new ArrayList<>();
        Collections.addAll(arrayOfNamesForExpectedMap,"ivan", "vani", "navi");

        Map<String, List<String>> exp = new HashMap();
        exp.put("ainv", arrayOfNamesForExpectedMap);

        Map<String, List<String>> akt = AnagramOfName.createAnagramMap(anagrams, name);
        Assert.assertEquals(exp, akt);
    }

    @Test
    public void AnagramOfName1() {
        String name = "anna";
        String[] anagrams = {"anna", "ivan", "naan", "vani", "piotr", "nana", "navi"};

        List<String> arrayOfNamesForExpectedMap = new ArrayList<>();
        Collections.addAll(arrayOfNamesForExpectedMap,"anna", "naan", "nana");

        Map<String, List<String>> exp = new HashMap();
        exp.put("aann", arrayOfNamesForExpectedMap);
        Map<String, List<String>> akt = AnagramOfName.createAnagramMap(anagrams, name);
        Assert.assertEquals(exp, akt);
    }
}
