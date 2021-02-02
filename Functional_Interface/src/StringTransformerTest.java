import org.junit.Assert;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

public class StringTransformerTest {

    //  "abc defG ikl" -> "ABC defG IKL"

    @Test
    public void testStringTransformer() {
        String sentence = "abc defG ikl";

        Predicate<String> p = s -> s.length() == 3;
        Function<String, String> f = s -> s.toUpperCase();

        String exp = "ABC defG IKL";
        String akt = StringTransformer.transform(sentence, p, f);

        Assert.assertEquals(exp, akt);
    }
}
