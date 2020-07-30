package JavaIOAssignment2.Task_3;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class SortFileByDateOfBirthTest {
    File file = new File("namesWithDates.txt");

    @Test
    public void fileWrongSortedPersons() throws IOException {
        String exp = "Piotr ,1955-10-01 Sergey,1979-02-15 Ivan,1986-03-22 Anna,1995-12-13" + System.lineSeparator().trim();
        String akt = Files.lines(Paths.get(String.valueOf(SortFileByDateOfBirth.sortFileByDateOfBirth(file))))
                .collect(Collectors.joining());

        Assert.assertNotEquals(exp,akt);
    }
}

