package Task_3;

import java.util.*;

public class AnagramOfName {
    public static void main(String[] args) {

    }

    /*  3. Анаграмма слова x - слово, по длине равное x и состоящее из таких же букв, что и x.
         Например, слово “vani” является анаграммой слова “ivan”, а слова “naan” и “anan” являются анаграммами слова “anna”.
         Дан словарь, содержащий анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
         Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.
         Например, по слову “ivan” функция вернет {“navi”, “vani”}
   */

    public static Set<String> findAnagramsFromName(List<String> anagrams, String name) {

        Set<String> anagramsFromName = new TreeSet<>();
        for (String anagram : anagrams) {
            if (anagram.length() == name.length()) {
                char[] charArr = name.toCharArray();
                char[] anagramsChar = anagram.toCharArray();
                Arrays.sort(charArr);
                Arrays.sort(anagramsChar);
                if (Arrays.equals(charArr, anagramsChar)) {
                    anagramsFromName.add(anagram);
                }
            }
        }
            return anagramsFromName;
    }
}