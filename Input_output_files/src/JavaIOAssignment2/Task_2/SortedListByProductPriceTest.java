package JavaIOAssignment2.Task_2;
import org.junit.Assert;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class SortedListByProductPriceTest {
    File file = new File("persons.txt");

    @Test
    public void wrongFile() throws IOException {
        String exp = "Sergey Lukichev,525 Ivan Petrov,5  Piotr Ivanov,860" + System.lineSeparator().trim();
        String akt = Files.lines(Paths.get(String.valueOf(SortedListByProductPrice.readAndSortPersonsFile(file))))
                .collect(Collectors.joining());

        Assert.assertNotEquals(exp,akt);
    }
}


