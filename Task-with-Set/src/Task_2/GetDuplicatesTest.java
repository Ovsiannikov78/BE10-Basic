package Task_2;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GetDuplicatesTest {

    @Test
    public void testGetDuplicates(){
        List<String> input = new ArrayList<>();
        Collections.addAll(input, "Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");

        Set<String> exp = new HashSet<>();
        Collections.addAll(exp,"Ivan", "Maria");

        Set<String> akt = GetDuplicates.getDuplicates(input);

        Assert.assertEquals(exp,akt);
    }
}
