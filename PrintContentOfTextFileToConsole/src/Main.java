import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;



public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");

        getContentFromTextFile(file);
    }
    public static void getContentFromTextFile(File file) throws IOException {
         Collection<String> lines = Files.readAllLines(Paths.get(String.valueOf(file)) );
            lines.forEach(System.out::println);
    }
}

