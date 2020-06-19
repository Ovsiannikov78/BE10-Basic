import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        String data = args[0];
        getContentFromTextFile(data);
    }
    public static void getContentFromTextFile(String data){
        try {
            Stream<String> lines = Files.lines(Paths.get(data));
            lines.forEach(System.out::println);
        }catch (IOException e){
            System.out.println("File not found");
            e.printStackTrace();
        }

    }
}

