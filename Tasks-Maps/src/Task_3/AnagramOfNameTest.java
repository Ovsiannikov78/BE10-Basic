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
    public void AnagramOfName(){
        String name = "ivan";
        List<String> anagrams = new ArrayList<>();
        Collections.addAll(anagrams, "anna", "ivan", "naan", "vani", "piotr", "nana", "navi");

        Set<String> exp = new TreeSet<>();
        Collections.addAll(exp, "ivan","navi","vani");

        Set<String> akt = AnagramOfName.findAnagramsFromName(anagrams,name);

        Assert.assertEquals(exp,akt);
    }
    @Test
    public void AnagramOfName1(){
        String name = "anna";
        List<String> anagrams = new ArrayList<>();
        Collections.addAll(anagrams, "anna", "ivan", "naan", "vani", "piotr", "nana","anan", "navi");

        Set<String> exp = new TreeSet<>();
        Collections.addAll(exp, "anna","naan","anan","nana");

        Set<String> akt = AnagramOfName.findAnagramsFromName(anagrams,name);

        Assert.assertEquals(exp,akt);
    }
}
