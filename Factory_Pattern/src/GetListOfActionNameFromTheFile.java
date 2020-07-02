import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetListOfActionNameFromTheFile {

   public static List<String> getListOfActionNamesFromTheFile(String actionNames) {
       try {
           return Files.lines(Paths.get(actionNames))
                   .flatMap((s) -> Arrays.stream(s.split("\\W+")))
                   .collect(Collectors.toList());
       } catch (IOException e) {
           e.printStackTrace();
       }
       return null;
   }
}
