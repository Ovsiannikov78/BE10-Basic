import java.util.function.Function;
import java.util.function.Predicate;

public class StringTransformer {
    public static void main(String[] args) {

    }
    //  "abc defG ikl" -> "ABC defG IKL"

    public static String transform(String sentence, Predicate<String> p, Function<String, String> f) {
        String[] words = sentence.split(" ");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (p.test(word)) {
                words[i] = f.apply(word);
            }
        }
        return String.join(" ", words);
    }
}


