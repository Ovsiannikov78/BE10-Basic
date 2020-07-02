import java.util.List;

public class School {
    public static void main(String[] args) {

        List<String> listOfActionNames = GetListOfActionNameFromTheFile.getListOfActionNamesFromTheFile(args[0]);

        if (listOfActionNames != null) {
            listOfActionNames.forEach(s -> new Process(s, new LearningActionFactory()).execute());
        }
    }
}
