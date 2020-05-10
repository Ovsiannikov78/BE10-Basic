package Set_Task_2;

import Set_Task_1.RemoveDuplicates;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class GetDuplicatesTest {

    @Test
    public void testGetDuplicates(){
       List<String> input = new ArrayList<>();
       Collections.addAll(input, "Ivan", "Maria", "Piotr", "Anna", "Maria", "Ivan");

        Set<String> exp = new LinkedHashSet<>();
        Collections.addAll(exp,"Ivan", "Maria");

        Set<String> akt = GetDuplicates.getDuplicates(input);

        Assert.assertEquals(exp,akt);
    }
}
