public class ReadAction implements LearningAction {
    private String actionName = "Read";

    @Override
    public void doAction() {
        System.out.println("Hello, " + actionName);

    }
}
