package HW_07_08_2020.Task_2;

public class SubsequenceFinder {
    /*
    Одна последовательность символов (чисел, букв, чего угодно) называется подпоследовательностью другой последовательности,
    если все элементы из первой встречаются во второй в том же порядке (то есть, если a и b есть в первой последовательности,
    при этом a идет "левее" b то и во второй они должны тоже быть и при этом a левее b).
    Например: {bcd} это подпоследовательность {A$%bGDFcLKKd}. Написать ф-ю, которая будет отвечать на вопрос, является ли одна последовательность подпоследовательностью другой. Ф-я принимает два String, возвращает boolean
     */

    public boolean isSubsequence(String pattern, String text) {
        return isSubsequenceRec(pattern, text, pattern.length(), text.length());

    }

    private boolean isSubsequenceRec(String pattern, String text, int patternLength, int textLength) {
        // if. the current length of the text is smaller than the current length of the pattern.
        // therefore the pattern cannot be a subsequence of the text
        if (patternLength > textLength)
            return false;
        if (patternLength == 0)
            return true;


        if (pattern.charAt(patternLength - 1) == text.charAt(textLength - 1))
            isSubsequenceRec(pattern, text, patternLength - 1, textLength - 1);
        return isSubsequenceRec(pattern, text, patternLength, textLength - 1);
    }
}
