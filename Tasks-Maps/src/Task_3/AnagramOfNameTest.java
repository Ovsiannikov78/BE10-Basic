package Task_3;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class AnagramOfNameTest {

  /*  3. Анаграмма слова x - слово, по длине равное x и состоящее из таких же букв, что и x.
         Например, слово “vani” является анаграммой слова “ivan”, а слова “naan” и “anan” являются анаграммами слова “anna”.
         Дан словарь, содержащий анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
         Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.
         Например, по слову “ivan” функция вернет {“navi”, “vani”}
*/

    @Test
    public void AnagramOfName() {
        String name = "ivan";
        List<String> anagrams = new ArrayList<>();
        Collections.addAll(anagrams, "anna", "ivan", "naan", "vani", "piotr", "nana", "navi");


        List<String> listOfNamesForExpectedMap = new ArrayList<>();
        Collections.addAll(listOfNamesForExpectedMap, "ivan", "vani", "navi");

        Map<String, List<String>> exp = new HashMap<>();
        exp.put("ainv", listOfNamesForExpectedMap);

        Map<String, List<String>> akt = AnagramOfName.createAnagramMap(anagrams, name);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void AnagramOfName1() {
        String name = "anna";
        List<String> anagrams = new ArrayList<>();
        Collections.addAll(anagrams, "anna", "ivan", "naan", "vani", "piotr", "nana", "navi");


        List<String> listOfNamesForExpectedMap = new ArrayList<>();
        Collections.addAll(listOfNamesForExpectedMap, "anna", "naan", "nana");

        Map<String, List<String>> exp = new HashMap<>();
        exp.put("aann", listOfNamesForExpectedMap);

        Map<String, List<String>> akt = AnagramOfName.createAnagramMap(anagrams, name);

        Assert.assertEquals(exp, akt);
    }
}
