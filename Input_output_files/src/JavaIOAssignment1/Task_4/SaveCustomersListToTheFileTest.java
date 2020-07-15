
package JavaIOAssignment1.Task_4;

import org.junit.Assert;
import org.junit.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SaveCustomersListToTheFileTest {
    File csvFile = new File("csv2.txt");
    File file3 = new File("test3.txt");
    List<Customer> customerList = Arrays.asList(
            new Customer("Vasya", "Petechkin", 15),
            new Customer("Petya", "Vasechkin", 18),
            new Customer("Jack", "Gibson", 25));

    @Test
    public void testFileCreatedSuccessfully() throws IOException {
        String exp = "Vasya,Petechkin,15 Petya,Vasechkin,18 Jack,Gibson,25" + System.lineSeparator().trim();
        String akt = Files.lines(Paths.get(String.valueOf(file3)))
                     .collect(Collectors.joining(" " + System.lineSeparator().trim()));

        Assert.assertEquals(exp,akt);
    }

    @Test
    public void testFileCreatedNotSuccessfully() throws IOException {
        String exp = "Vasya,Petechkin,15 Petya,Vasechkin,18 Jack,Gibson,25" + System.lineSeparator().trim();
        File akt = SaveCustomersListToTheFile.writeCustomersToTheCsvFile_1(customerList,csvFile);

        Assert.assertNotEquals(exp,akt);
    }
    @Test (expected = IOException.class)
    public void testFileNotFound() throws IOException {
        String exp = "Vasya,Petechkin,15 Petya,Vasechkin,18 Jack,Gibson,25" + System.lineSeparator().trim();
        String akt = Files.lines(Paths.get(String.valueOf("someFile.txt")))
                .collect(Collectors.joining(" " + System.lineSeparator().trim()));

        Assert.assertEquals(exp,akt);
    }
}


