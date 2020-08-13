package telran;

public class TextCutter {
    /*
    Есть текст (слова, разделенные пробелами). Есть число N>0. Задача: оставить связный
    текст максимальной длины, но не превышающий N.  Например:
    «Hallo world» (11 символов). Если N>=11, то результат: «Hello world»
    Если N>=5 → «Hello»
    Если N=7 → «Hello»
    Если N<5 → «» (Пустая строка)
*/
    public String cut (String text, int N){
        if(N >= text.length())
            return text;

        String cutText = text.substring(0,N);
        if(text.charAt(N) == ' ')
            return cutText;

        int lastSpaceIndex = cutText.lastIndexOf(' ');
        return lastSpaceIndex == -1 ? "" : cutText.substring(0,lastSpaceIndex);
    }
}
