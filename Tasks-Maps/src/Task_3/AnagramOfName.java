package Task_3;


import java.util.*;

public class AnagramOfName {
    public static void main(String[] args) {

    }

    /*  3. Анаграмма слова x - слово, по длине равное x и состоящее из таких же букв, что и x.
         Например, слово “vani” является анаграммой слова “ivan”, а слова “naan” и “anan” являются анаграммами слова “anna”.
         Дан словарь, содержащий анаграммы, например {“anna”, “ivan”, “naan”, “vani”, “piotr”, “nana”, “navi”}.
         Написать функцию, которая по слову из словаря вернет все анаграммы этого слова, которые есть в словаре.
         Например, по слову “ivan” функция вернет {“ivan”, “navi”, “vani”}
*/

    public static char[] getSortedCharArrayFromString(String string) {
        char[] charArr = string.toCharArray();
        Arrays.sort(charArr);
        return charArr;
    }


    public static Map<String, List<String>> createAnagramMap(List<String> anagrams, String name) {
        Map<String, List<String>> anagramMap = new HashMap<>();
        List<String> listOfAnagramsFromName = new ArrayList<>();
        for (String anagram : anagrams) {
            if (anagram.length() == name.length()) {
                if (Arrays.equals(getSortedCharArrayFromString(anagram), getSortedCharArrayFromString(name))) {
                    listOfAnagramsFromName.add(anagram);
                }
            }
        }
        anagramMap.put(new String(getSortedCharArrayFromString(name)), listOfAnagramsFromName);
        return anagramMap;
    }
}