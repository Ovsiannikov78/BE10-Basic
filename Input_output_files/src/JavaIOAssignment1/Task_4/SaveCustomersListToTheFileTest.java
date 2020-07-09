/*
package JavaIOAssignment1.Task_4;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class SaveCustomersListToTheFileTest {
    File csvFile = new File("csv2.txt");
    File file3 = new File("test3.txt");
    List<Customer> customerList = Arrays.asList(
            new Customer("Vasya", "Petechkin", 15),
            new Customer("Petya", "Vasechkin", 18),
            new Customer("Jack", "Gibson", 25));

    @Test
    public void testFileCreatedSuccessfully() throws IOException {

        File exp = new File(String.valueOf(csvFile));
        File akt = SaveCustomersListToTheFile.writeCustomersToTheCsvFile_1(customerList,csvFile);

        Assert.assertEquals(exp,akt);

    }
}

 */
