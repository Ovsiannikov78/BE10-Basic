public class SolveAction implements LearningAction {
   private String actionName = "Solve";

    @Override
    public void doAction() {
        System.out.println("Hello, " + actionName);
    }
}
