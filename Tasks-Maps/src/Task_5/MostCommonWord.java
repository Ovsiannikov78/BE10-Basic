package Task_5;

import java.util.*;

public class MostCommonWord {
    public static void main(String[] args) {

    }
    /*
    5. Дан текст, подсчитать, какое слово встречается больше остальных.
       Слова в предложениях могут разделяться запятыми, точками, пробелами.
       Предлоги [в, на, из, под] и остальные не учитывать при подсчете.
     */

    public static Map<String, Integer> findMostCommonWord(String text) {
        Map<String, Integer> words = new HashMap<>();
        List<String> listOfWords = new LinkedList<>(Arrays.asList(text.split("\\s*(\\s|,|!|\\.)\\s*")));
        for (String str : listOfWords) {
            if (str.length() > 3) {
                if (words.containsKey(str)) {
                    words.put(str, words.get(str) + 1);
                } else {
                    words.put(str, 1);
                }
            }
        }

        Map.Entry mostCommonWord = Collections.max(words.entrySet(), Comparator.comparingInt(Map.Entry::getValue));
        words.clear();
        words.put((String) mostCommonWord.getKey(), (Integer) mostCommonWord.getValue());
        return words;
    }
}
