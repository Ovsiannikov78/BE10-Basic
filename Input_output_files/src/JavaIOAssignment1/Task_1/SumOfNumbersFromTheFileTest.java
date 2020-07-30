package JavaIOAssignment1.Task_1;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SumOfNumbersFromTheFileTest {

    @Test
    public void testCorrectExpectedSumResult() throws IOException {
        Integer exp = 107;
        Integer akt = SumOfNumbersFromTheFile.getSumOfNumbersFromTheFile(new File("JavaIOAssignment1.Task_1.txt"));

        Assert.assertEquals(exp, akt);
    }

    @Test
    public void testWrongExpectedSumResult() throws IOException {
        Integer exp = 10;
        Integer akt = SumOfNumbersFromTheFile.getSumOfNumbersFromTheFile(new File("JavaIOAssignment1.Task_1.txt"));

        Assert.assertNotEquals(exp, akt);
    }

    @Test(expected = FileNotFoundException.class)
    public void testFileNotFoundException() throws IOException {
        Integer exp = 107;
        Integer akt = SumOfNumbersFromTheFile.getSumOfNumbersFromTheFile(new File("JavaIOAssignment1.txt"));

        Assert.assertEquals(exp, akt);
    }
}