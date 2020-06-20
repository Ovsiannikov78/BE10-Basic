public class WatchAction implements LearningAction {
    private String actionName = "Watch";

    @Override
    public void doAction() {
        System.out.println("Hello, " + actionName);
    }
}
