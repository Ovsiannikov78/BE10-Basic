package Task_2_ToUpperAndToLowerCase;

import org.junit.Assert;
import org.junit.Test;

public class ToUpperAndToLowerCaseTest {
    String str = "Hel*lo";
        /*
           Есть строка. Вернуть новую строку, полученную из первой
           следующим образом, заглавные буквы становятся маленькими,
           а маленькие - заглавными ; Hel*lo -> hEL*LO
        */

    @Test
    public void correctlyConvertedString() {
        String exp = "hEL*LO";
        String akt = ToUpperAndToLowerCase.stringTransformationByRequest(str);

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void incorrectlyConvertedString() {
        String exp = "HEL*lo";
        String akt = ToUpperAndToLowerCase.stringTransformationByRequest(str);

        Assert.assertNotEquals(exp, akt);
    }
}
